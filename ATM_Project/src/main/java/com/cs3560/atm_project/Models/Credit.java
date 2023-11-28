/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project.Models;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cs3560.atm_project.Views.LoginGUI;

/**
 *
 * @author lkbao
 */
public class Credit extends Account{
    private double creditLimit;
    private double creditUsed;
    
    final String GET_CREDIT = "SELECT * FROM credit WHERE accountID = ";
    
    /**
     * Constructor for Credit.
     * @param accountID ID to be retrieve from database.
     */
    public Credit(int accountID) {
        super(accountID);

        isCredit = true;
        
        db = new DatabaseConnection();
        rs = db.getQuery(String.format(GET_CREDIT + accountID));
        
        try {
            if (rs.next() == false) {
                System.out.println("AccountID not found");
            } else {
                do {
                    creditLimit = rs.getDouble("creditLimit");
                    creditUsed = rs.getDouble("creditUsed");
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Update credit used into database.
     * @param amount amount to be increase to creditUsed.
     * @return true if credit used is less than credit limit, false otherwise.
     */
    public boolean updateCreditUsed(double amount) {
        boolean result = false;
        creditUsed += amount;
        if (creditLimit > creditUsed) {
            String query = String.format("UPDATE credit SET creditUsed = %f WHERE accountID = %d", creditUsed, super.getAccountID());
            db.executeUpdate(query);
            result = true;
        } else {
            System.out.println("Cannot use above credit limit");
        }
        return result;
    }    
    
    
    /**
     * Getter for credit limit.
     * @return credit limit.
     */
    public double getCreditLimit() {
        return creditLimit;
    }
    /**
     * Getter for credit used
     * @return credit used
     */
    public double getCreditUsed() {
        return creditUsed;
    }

    public double getAvailableCredit() {
        return creditLimit - creditUsed;
    }
}
