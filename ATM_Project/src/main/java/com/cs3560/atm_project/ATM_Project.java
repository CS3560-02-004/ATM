/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cs3560.atm_project;

/**
 *
 * @author gippy
 */
public class ATM_Project {
    private static Login_GUI loginGui;
    private static Home_Screen homeGui;

    public static void main(String[] args) {
        System.out.println("HELLO");
//        Login_GUI loginGui = new Login_GUI();
        loginGui = new Login_GUI();
        homeGui = new Home_Screen();
        loginGui.run();
    }
    
    public static void goToHomeScreen() {
        // there should be a better way to do this, I will continue to look into this
        loginGui.setVisible(false);
        homeGui.setVisible(true);
    }
}
