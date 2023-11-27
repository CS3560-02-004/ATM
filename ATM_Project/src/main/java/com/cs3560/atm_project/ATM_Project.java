/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cs3560.atm_project;

import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cs3560.atm_project.Models.Checking;
import com.cs3560.atm_project.Models.Credit;
import com.cs3560.atm_project.Views.ATMMenuGUI;
import com.cs3560.atm_project.Views.BalanceGUI;
import com.cs3560.atm_project.Views.DepositWindowGUI;
import com.cs3560.atm_project.Views.InsertPinGUI;
import com.cs3560.atm_project.Views.LoginGUI;
import com.cs3560.atm_project.Views.TransferGUI;
import com.cs3560.atm_project.Views.WithdrawWindowGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gippy
 */
// Test Card: 1181159426469480
// Test Pin: 1014
// Test Debit: 9703052905532230
// Pin: 3465
public class ATM_Project {
    private static LoginGUI loginGui;
    private static ATMMenuGUI homeGui;
    private static InsertPinGUI pinGui;
    private static DepositWindowGUI depositGui;
    private static WithdrawWindowGUI withdrawGui;
    private static TransferGUI transferGui;
    private static BalanceGUI balanceGui;
    private static StackPanel stackPanel;
       
    public static void main(String[] args) {
        System.out.println("HELLO");

        stackPanel = new StackPanel();
        
        loginGui = new LoginGUI();
        homeGui = new ATMMenuGUI();
        pinGui = new InsertPinGUI();
        depositGui = new DepositWindowGUI();
        withdrawGui = new WithdrawWindowGUI();
        transferGui = new TransferGUI();
        balanceGui = new BalanceGUI();
        
        stackPanel.setVisible(true);
        stackPanel.setResizable(false);
        
        stackPanel.addStack("login", loginGui);
        stackPanel.addStack("home", homeGui);        
        stackPanel.addStack("pin", pinGui);
        stackPanel.addStack("deposit", depositGui);
        stackPanel.addStack("withdraw", withdrawGui);
        stackPanel.addStack("transfer", transferGui);
        stackPanel.addStack("balance", balanceGui);
        stackPanel.showStack("login");
    }
    
    public static void goToScreen(String screen) {
        System.out.println("going to " + screen);
        stackPanel.showStack(screen);
    }
    
    public static void goToPreviousScreen() {
        stackPanel.showPrevious();
    }
    
    public static InsertPinGUI getInsertPinGUI() {
        return pinGui;
    }
    
    public static ATMMenuGUI getMenuGUI() {
        return homeGui;
    }
    
    public static BalanceGUI getBalanceGUI() {
        return balanceGui;
    }
    
    public static WithdrawWindowGUI getWithdrawGUI(){
        return withdrawGui;
    }
    
    // Get Checking object saved in homeGui
    public static Checking getCheckingAccount(){
        return homeGui.checking_account;
    }
    
    // Get Credit object saved in homeGui
    public static Credit getCreditAccount(){
        return homeGui.credit_account;
    }
    
    public static int getATM() {
        return homeGui.getAtmID();
    }
}
