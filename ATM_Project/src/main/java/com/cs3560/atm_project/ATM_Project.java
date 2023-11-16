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
    private static HomeScreen homeGui;
    private static InsertPinGUI pinGui;
    private static StackPanel stackPanel;
    
    public static void main(String[] args) {
        System.out.println("HELLO");
//        Login_GUI loginGui = new Login_GUI();
        
        stackPanel = new StackPanel();
        
        loginGui = new LoginGUI();
        homeGui = new HomeScreen();
        pinGui = new InsertPinGUI();
        
        stackPanel.setVisible(true);
        
        stackPanel.addStack("login", loginGui);
        stackPanel.addStack("home", homeGui);
        stackPanel.addStack("pin", pinGui);
        stackPanel.showStack("login");
//        loginGui.setVisible(true);
    }
    
    public static void goToScreen(String screen) {
        System.out.println("going to " + screen);
        stackPanel.showStack(screen);
    }    
}
