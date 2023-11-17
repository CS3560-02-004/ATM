/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
    private Connection connection;
    private Statement statement;
    private ResultSet rs;
    
    public DatabaseConnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsystem", "root", "asdf1234QWER!@#$");
            System.out.println("Database Connected");
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getQuery(String query){
        try{
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public int executeUpdate(String query) {
    int affectedRows = 0;
    try (Statement statement = connection.createStatement()) {
        affectedRows = statement.executeUpdate(query);
    } catch (SQLException ex) {
        Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    return affectedRows;
}
}
