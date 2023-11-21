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
    private final String URL = "jdbc:mysql://localhost:3306/atmsystem";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    
    private Connection connection;
    private Statement statement;
    private ResultSet rs;
    
    /**
     * Constructor create connection to database.
     */
    public DatabaseConnection(){
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database Connected");
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Execute retrieve query to database.
     * @param query string to be executed.
     * @return ResultSet data values getting from the query.
     */
    public ResultSet getQuery(String query){
        try{
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    /**
     * Execute update to the database.
     * @param query string to be executed.
     * @return affected rows.
     */
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
