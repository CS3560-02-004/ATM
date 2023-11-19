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
public class Checking {
    private double checkingBalance;
    
    private final String GET_CHECKING_BALANCE = "SELECT * FROM checking WHERE accountID = ";
    
    private DatabaseConnection db;
    private ResultSet rs;
    
    // Constructor
    public Checking(int accountID) {
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
    
    // Get checking balance
    public double getcheckingBalance() {
        return checkingBalance;
    }
}
