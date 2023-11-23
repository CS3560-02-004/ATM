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
    private List<Integer> accountIDList;
    private DatabaseConnection db;
    private ResultSet rs;
    
    private String GET_CUSTOMER = "SELECT * FROM accounttable WHERE accountID = ";
    private String GET_ACCOUNT_LIST = "SELECT * FROM accounttable WHERE customerID = ";
    
    public Customer(int accountID) {
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
    
    private void queryAccountList() {
        rs = db.getQuery(String.format(GET_ACCOUNT_LIST + customerID));
        try {
            if (rs.next() == false) {
                System.out.println("No account Found");
            } else {
                do {
                    accountIDList.add(rs.getInt("accountID"));
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List getListAccount() {
        return accountIDList;
    }
    
    public int getCustomerID() {
        return customerID;
    }
    
    
}
