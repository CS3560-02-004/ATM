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
public class Account {
    private int accountID;
    private String dateCreated;
    
    private DatabaseConnection db;
    private ResultSet rs;
    private final String GET_ACCOUNT = "SELECT * FROM accounttalbe WHERE accountID = ";
    
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
    
    public int getAccountID() {
        return accountID;
    }
    
    public String getDateCreated() {
        return dateCreated;
    }
}
