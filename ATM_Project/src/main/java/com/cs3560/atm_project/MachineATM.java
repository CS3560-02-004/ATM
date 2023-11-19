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
public class MachineATM {
    private int atmID;
    private String branch;
    private int oneQuantity;
    private int twoQuantity;
    private int fiveQuantity;
    private int tenQuantity;
    private int twentyQuantity;
    private int fiftyQuantity;
    private int hundredQuantity;
    
    private final String GET_ATM_MACHINE = "SELECT * FROM atm WHERE atmID = ";
    private DatabaseConnection db;
    private ResultSet rs;
    
    // Constructor
    public MachineATM(int amtID) {
        db = new DatabaseConnection();
        rs = db.getQuery(String.format(GET_ATM_MACHINE + atmID));
        
        try {
            if (rs.next() == false) {
                System.out.println("Machine ID not found in database");
            } else {
                do {
                    this.atmID = atmID;
                    branch = rs.getString("branch");
                    oneQuantity = rs.getInt("oneDollarQuantity");
                    twoQuantity = rs.getInt("twoDollarQuantity");
                    fiveQuantity = rs.getInt("fiveDollarQuantity");
                    tenQuantity = rs.getInt("tenDollarQuantity");
                    twentyQuantity = rs.getInt("twentyDollarQuantity");
                    fiftyQuantity = rs.getInt("fiftyDollarQuantity");
                    hundredQuantity = rs.getInt("hundredDollarQuantity");
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    Getter for various variable
    */
    
    // Get branch name
    public String getBranch() {
        return branch;
    }
    // Get available quantity of one dollar
    public int getOneQuantity() {
        return oneQuantity;
    }
    // Get available quantity of two dollar
    public int getTwoQuantity() {
        return twoQuantity;
    }
    // Get available quantity of five dollar
    public int getFiveQuantity() {
        return fiveQuantity;
    }
    // Get available quantity of ten dollar
    public int getTenQuantity() {
        return tenQuantity;
    }
    // Get available quantity of twenty dollar
    public int getTwentyQuantity() {
        return twentyQuantity;
    }
    // Get available quantity of fifty dollar
    public int getFiftyQuantity() {
        return fiftyQuantity;
    }
    // Get available quantity of one hundred dollar
    public int getHundredQuantity() {
        return hundredQuantity;
    }
}
