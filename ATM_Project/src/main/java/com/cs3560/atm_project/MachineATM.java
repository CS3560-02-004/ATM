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
    // 0 -> 6: one, two, five, ten, twenty, fifty, hundred
    private String[] dollar = {"oneDollarQuantity", "twoDollarQuantity", };
    private int[] quantity;
    
    private final String GET_ATM_MACHINE = "SELECT * FROM atm WHERE atmID = ";
    private DatabaseConnection db;
    private ResultSet rs;
    
    // Constructor
    public MachineATM(int amtID) {
        db = new DatabaseConnection();
        rs = db.getQuery(String.format(GET_ATM_MACHINE + atmID));
        
        quantity = new int[7];
        try {
            if (rs.next() == false) {
                System.out.println("Machine ID not found in database");
            } else {
                do {
                    this.atmID = atmID;
                    branch = rs.getString("branch");
                    quantity[0] = rs.getInt("oneDollarQuantity");
                    quantity[1] = rs.getInt("twoDollarQuantity");
                    quantity[2] = rs.getInt("fiveDollarQuantity");
                    quantity[3] = rs.getInt("tenDollarQuantity");
                    quantity[4] = rs.getInt("twentyDollarQuantity");
                    quantity[5] = rs.getInt("fiftyDollarQuantity");
                    quantity[6] = rs.getInt("hundredDollarQuantity");
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean reduceQuantity(int one, int two, int five, int ten, int twenty, int fifty, int hundred) {
        boolean result = true;
        int[] reduce = {one, two, five, ten, twenty, fifty, hundred};
        for (int i = 0; i < quantity.length; i++) {
            if (quantity[i] > reduce[i]) {
                reduce[i] = quantity[i] - reduce[i];
            } else {
                System.out.println("Cannot reduce below 0");
                result = false;
                break;
            }
        }
        if (result) {
            updateDatabaseQuantity(reduce);
        }
        
        return result;
    }
    
    private int updateDatabaseQuantity(int[] reduce) {
        String query = String.format("UPDATE atm SET oneDollarQuantity = %d, twoDollarQuantity = %d, fiveDollarQuantity = %d, tenDollarQuantity= %d, twentyDollarQuantity = %d, fiftyDollarQuantity = %d, hundredDollarQuantity = %d WHERE atmID = ", reduce[0],reduce[1],reduce[2],reduce[3],reduce[4], reduce[5], reduce[6], atmID);
        int affected = db.executeUpdate(query);
        return affected;
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
        return quantity[0];
    }
    // Get available quantity of two dollar
    public int getTwoQuantity() {
        return quantity[1];
    }
    // Get available quantity of five dollar
    public int getFiveQuantity() {
        return quantity[2];
    }
    // Get available quantity of ten dollar
    public int getTenQuantity() {
        return quantity[3];
    }
    // Get available quantity of twenty dollar
    public int getTwentyQuantity() {
        return quantity[4];
    }
    // Get available quantity of fifty dollar
    public int getFiftyQuantity() {
        return quantity[5];
    }
    // Get available quantity of one hundred dollar
    public int getHundredQuantity() {
        return quantity[6];
    }
}
