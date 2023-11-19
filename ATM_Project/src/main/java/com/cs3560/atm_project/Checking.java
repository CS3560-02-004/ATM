/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lkbao
 */
public class Checking extends Account{
    private double checkingBalance;
    
    private final String GET_CHECKING_BALANCE = "SELECT * FROM checking WHERE accountID = ";
    
    private DatabaseConnection db;
    private ResultSet rs;
    
    // Constructor
    public Checking(int accountID) {
        super(accountID);
        
        db = new DatabaseConnection();
        rs = db.getQuery(String.format(GET_CHECKING_BALANCE + accountID));
        
        try {
            if (rs.next() == false) {
                System.out.println("AccountID not found");
            } else {
                do {
                    checkingBalance = rs.getDouble("checkingBalance");
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean updateCheckingBalance(double reducedAmount) {
        boolean result = false;
        if (checkingBalance > reducedAmount) {
            String query = String.format("UPDATE checking SET checkingBalance = %d WHERE accountID = %d", reducedAmount, super.getAccountID());
            db.executeUpdate(query);
            result = true;
        } else {
            System.out.println("Cannot reduce balance below 0");
        }
        return result;
    }
    
    
    // Get checking balance
    public double getcheckingBalance() {
        return checkingBalance;
    }
    
    
    @Override
    public int getAccountID() {
        return super.getAccountID();
    }
    @Override
    public String getDateCreated() {
        return super.getDateCreated();
    }
}
