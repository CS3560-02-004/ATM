/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cs3560.atm_project.Views.LoginGUI;

import java.util.ArrayList;
/**
 *
 * @author lkbao
 */
public class Checking extends Account{
    private double checkingBalance;
    
    private final String GET_CHECKING_BALANCE = "SELECT * FROM checking WHERE accountID = ";

        
    /**
     * Constructor for checking account.
     * @param accountID of account
     */
    public Checking(int accountID) {
        super(accountID);
        
        isCredit = false;

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
    /**
     * Reduce checkingBalance in the database.
     * @param reducedAmount amount of reduction.
     * @return true if checking balance is larger than reduce amount, else false .
     */
    public boolean reduceCheckingBalance(double reducedAmount) {
        boolean result = false;
        if (checkingBalance > reducedAmount) {
            checkingBalance = checkingBalance - reducedAmount;
            String query = String.format("UPDATE checking SET checkingBalance = %f WHERE accountID = %d", checkingBalance, super.getAccountID());
            db.executeUpdate(query);
            result = true;
        } else {
            System.out.println("Cannot reduce balance below 0");
        }
        return result;
    }
    
    public void updateComboBox(int accountID, int customerID) {
        db = new DatabaseConnection();
        String query = String.format("SELECT accountID FROM accounttable WHERE accountID = %d AND customerID = %f", super.getAccountID(), customerID);
        rs = db.getQuery(query);
        
        ArrayList<String> accounts = new ArrayList<>();
        accounts.add("Select");
        if (rs != null) {
            try {
                while (rs.next()) {
                int value = rs.getInt(1);
                String stringValue = String.valueOf(value);
                accounts.add(stringValue);
            }
            }
            catch (SQLException e) {
                
            }
        }
        
//        for (String item : accounts) {
//            accountComboBox.add(item);
//        }
    }
    /**
     * Update checkingBalance in the database, for deposit
     * @param depositAmount amount of reduction.
     */
    public void updateCheckingBalance(double depositAmount) {
        rs = db.getQuery("SELECT * FROM checking");
        try {
            while(rs.next()){
                    
            }
            checkingBalance +=+ depositAmount;
            System.out.println("NEW TOTAL:  " + checkingBalance);
            String query = String.format("UPDATE checking SET checkingBalance = %f WHERE accountID = %d", checkingBalance, super.getAccountID());
            db.executeUpdate(query);
        }
        catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean transferFunds(double transferAmount, int accountNumber) {
    	// if transferAmt is negative or zero
    	if (transferAmount <= 0) {
    		System.out.println("Invalid transfer amount.");
    		return false;
    	}
    	// if transferAmt is over the current checkingBalance
    	if (transferAmount > checkingBalance) {
    		System.out.println("Insufficient funds for transfer.");
    		return false;
    	}
    	// if transferAmt is valid
    	else {
            try {
                // Update the sender's balance
                checkingBalance -= transferAmount;
                String query1 = String.format("UPDATE checking SET checkingBalance -= %f WHERE accountID = %d", transferAmount, super.getAccountID());
                db.executeUpdate(query1);

                // Update the recipient's balance
                String query2 = String.format("UPDATE checking SET checkingBalance += %f WHERE accountID = %d", transferAmount, accountNumber);
                db.executeUpdate(query2);
                
                // Transfer successful
                return true;
            } 
            catch (Exception e) {
                // Transfer failed due to a database error
                e.printStackTrace();
                return false;
            }
    	}
    }
    
    
    /**
     * Getter for checking balance.
     * @return checking balance.
     */
    public double getcheckingBalance() {
        return checkingBalance;
    }
}
