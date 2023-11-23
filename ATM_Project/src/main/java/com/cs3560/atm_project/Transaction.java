/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project;

/**
 *
 * @author lkbao
 */
public class Transaction {
    private DatabaseConnection db;
    private final String CREATE_SACTION = "INSERT INTO transactiontable (accountID, atmID, transactionDate, transactionType, transactionStatus) values ";
    
    public Transaction(int accountID, int atmID, String transactionType, String transactionStatus) {
        db = new DatabaseConnection();
        String values = String.format("(%d, %d, %s, '%s', '%s');", accountID, atmID, "CURRENT_DATE()", transactionType, transactionStatus);
        String query = CREATE_SACTION + values;
        
        db.executeUpdate(query);
        
    }
}
