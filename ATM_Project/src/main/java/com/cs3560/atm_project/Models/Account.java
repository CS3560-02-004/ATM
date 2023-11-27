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

/**
 *
 * @author lkbao
 */
public abstract class Account {
    private int accountID;
    private String dateCreated;
    
    private DatabaseConnection db;
    private ResultSet rs;
    private final String GET_ACCOUNT = "SELECT * FROM accounttable WHERE accountID = ";
    
    /**
     * Constructor for Account.
     * @param accountID to be retrieve from database.
     */
    public Account(int accountID) {
        db = new DatabaseConnection();
        rs = db.getQuery(String.format(GET_ACCOUNT + accountID));

        this.accountID = accountID;

        try {
            while (rs.next()) {
                dateCreated = rs.getString("dateCreated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Getter for accountID
     * @return accountID
     */
    public int getAccountID() {
        return accountID;
    }
    /**
     * Getter for dateCreated
     * @return date created
     */
    public String getDateCreated() {
        return dateCreated;
    }
}
