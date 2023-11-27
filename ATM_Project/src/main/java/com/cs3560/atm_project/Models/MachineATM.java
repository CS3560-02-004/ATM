/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cs3560.atm_project.ATM_Project;
import com.cs3560.atm_project.Views.LoginGUI;

/**
 *
 * @author lkbao
 */
public class MachineATM {
    private int atmID;
    private String branch;
    // 0 -> 6: one, two, five, ten, twenty, fifty, hundred
    private String[] strQuantity = { "oneDollarQuantity", "twoDollarQuantity", "fiveDollarQuantity", "tenDollarQuantity", "twentyDollarQuantity", "fiftyDollarQuantity", "hundredDollarQuantity"};
    private int[] quantity;
    
    private final String GET_ATM_MACHINE = "SELECT * FROM atm WHERE atmID = ";
    private DatabaseConnection db;
    private ResultSet rs;
    
    // Constructor
    public MachineATM() {
        this.atmID = ATM_Project.getMenuGUI().getAtmID();
        db = new DatabaseConnection();
        rs = db.getQuery(String.format(GET_ATM_MACHINE + atmID));
        
        quantity = new int[7];
        try {
            if (rs.next() == false) {
                System.out.println("Machine ID not found in database");
            } else {
                do {
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
    /**
     * Reduce quantity of cash in the database with value from @param.
     * @param one one dollar quantity reduced.
     * @param two two dollar quantity reduced.
     * @param five five dollar quantity reduced.
     * @param ten ten dollar quantity reduced.
     * @param twenty twenty dollar quantity reduced.
     * @param fifty fifty dollar quantity reduced.
     * @param hundred one hundred dollar quantity reduced.
     * @return result if the action can be perform. 
     */
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
    
        /**
     * Increase quantity of cash in the database with value from @param.
     * @param one one dollar quantity increased.
     * @param two two dollar quantity increased.
     * @param five five dollar quantity increased.
     * @param ten ten dollar quantity increased.
     * @param twenty twenty dollar quantity increased.
     * @param fifty fifty dollar quantity increased.
     * @param hundred one hundred dollar quantity increased.
     * @return result if the action can be perform. 
     */
    public boolean increaseQuantity(int one, int two, int five, int ten, int twenty, int fifty, int hundred) {
        boolean result = true;
        int[] increase = {one, two, five, ten, twenty, fifty, hundred};
        for (int i = 0; i < quantity.length; i++) {
            if (quantity[i] > increase[i]) {
                increase[i] = quantity[i] + increase[i];
            }
        }
        if (result) {
            updateDatabaseQuantity(increase);
        }
        
        return result;
    }
    /**
     * Support method that execute the query to update database value.
     * @param reduce array of dollar to be reduced.
     */
    private void updateDatabaseQuantity(int[] reduce) {
        String query;
        for (int i = 0; i < quantity.length; i++) {
            query = String.format("UPDATE atm SET %s = %d WHERE atmID = %d",strQuantity[i], reduce[i], atmID);
            db.executeUpdate(query);

        }
    }
    
    /*
    Getter for various variable
    */
    
    /**
     * Getter for branch.
     * @return branch name.
     */
    public String getBranch() {
        return branch;
    }
    /**
     * Getter for one dollar quantity.
     * @return one dollar quantity.
     */
    public int getOneQuantity() {
        return quantity[0];
    }
    /**
     * Getter for two dollar quantity.
     * @return two dollar quantity.
     */
    public int getTwoQuantity(){
        return quantity[1];
    }
    /**
     * Getter for five dollar quantity.
     * @return five dollar quantity.
     */
    public int getFiveQuantity() {
        return quantity[2];
    }
    /**
     * Getter for ten dollar quantity.
     * @return ten dollar quantity.
     */
    public int getTenQuantity() {
        return quantity[3];
    }
    /**
     * Getter for twenty dollar quantity.
     * @return twenty dollar quantity.
     */
    public int getTwentyQuantity() {
        return quantity[4];
    }
    /**
     * Getter for fifty dollar quantity.
     * @return fifty dollar quantity.
     */
    public int getFiftyQuantity() {
        return quantity[5];
    }
    /**
     * Getter for one hundred dollar quantity.
     * @return one hundred dollar quantity.
     */
    public int getHundredQuantity() {
        return quantity[6];
    }
}
