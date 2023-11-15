/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cs3560.atm_project;

import java.awt.CardLayout;

/**
 *
 * @author gippy
 */
public class ATM_Project {
    private static LoginGUI loginGui;
    private static ATMMenuGUI homeGui;
    private static InsertPinGUI pinGui;
    private static DepositWindowGUI depositGui;
    private static StackPanel stackPanel;
    
    public static void main(String[] args) {
        System.out.println("HELLO");
        
        stackPanel = new StackPanel();
        
        loginGui = new LoginGUI();
        homeGui = new ATMMenuGUI();
        pinGui = new InsertPinGUI();
        depositGui = new DepositWindowGUI();
        
        stackPanel.setVisible(true);
        
        stackPanel.addStack("login", loginGui);
        stackPanel.addStack("home", homeGui);        
        stackPanel.addStack("pin", pinGui);
        stackPanel.addStack("deposit", depositGui);
        stackPanel.showStack("login");
    }
    
    public static void goToScreen(String screen) {
        System.out.println("going to " + screen);
        stackPanel.showStack(screen);
    }    
}
