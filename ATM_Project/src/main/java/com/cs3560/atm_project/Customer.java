/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lkbao
 */
public class Customer {
    private int customerID;
    private int thisAccountID;
    private ArrayList<Integer> accountIDList;
    private DatabaseConnection db;
    private ResultSet rs;
    
    private static final String GET_CUSTOMER = "SELECT * FROM accounttable WHERE accountID = ";
    private static final String GET_ACCOUNT_LIST = "SELECT * FROM accounttable WHERE customerID = ";
    private static final String CHECK_IF_CHECKING = "SELECT * FROM checking WHERE accountID = ";
    private static final String CHECK_IF_CREDIT = "SELECT * FROM credit WHERE accountID = ";
    private static final String CHECK_IF_SAVING = "SELECT * FROM saving WHERE accountID = ";
    
    public Customer(int accountID) {
        thisAccountID = accountID;
                
        accountIDList = new ArrayList<>();
        db = new DatabaseConnection();
        
        rs = db.getQuery(String.format(GET_CUSTOMER + accountID));
        
        try {
            if (rs.next() == false) {
                System.out.println("CustomerID not found");
            } else {
                do {
                    this.customerID = rs.getInt("customerID");
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (customerID != 0) {
            queryAccountList();
        }
    }
    
    public ArrayList<Integer> returnAccountList(){
        return accountIDList;
    }
    
    // Return:
    // 0 if checking
    // 1 if credit
    // 2 if savings
    // 3 if problem
    public static int returnAccountType(int accountID){
        DatabaseConnection db = new DatabaseConnection();
        ResultSet rs;
        
        // Check if checking
        rs = db.getQuery(String.format(CHECK_IF_CHECKING + accountID));
        try {
            if (rs.next() == true) {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Check if credit
        rs = db.getQuery(String.format(CHECK_IF_CREDIT + accountID));
        try {
            if (rs.next() == true) {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Check if savings
        rs = db.getQuery(String.format(CHECK_IF_SAVING + accountID));
        try {
            if (rs.next() == true) {
                return 2;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 3;
    }
    
    
    private void queryAccountList() {
        int accountNumBuffer = 0;
        rs = db.getQuery(String.format(GET_ACCOUNT_LIST + customerID));
        try {
            if (rs.next() == false) {
                System.out.println("No account Found");
            } else {
                do {
                    accountNumBuffer = rs.getInt("accountID");
                    if(accountNumBuffer != thisAccountID){
                        accountIDList.add(accountNumBuffer);
                    }
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getCustomerID() {
        return customerID;
    }
    
    
}
