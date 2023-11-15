/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project;

import java.awt.CardLayout;
import javax.swing.JComponent;

/**
 * Fancy wrapper for the CardLayout, allowing for easy navigation between JPanels
 * @author joseph
 */
public class StackPanel extends javax.swing.JFrame {
    CardLayout layout = new CardLayout();
    
    public StackPanel() {
        super();
        setLayout( layout );
        setSize(600, 400);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
    }
    
    public void  addStack(String name, JComponent child) {
        add(name, child);
    }
    
    public void showStack(String name) {
        System.out.println("going to " + name);
        layout.show(getContentPane(), name);        
    }
    
    public void showPrevious() {
        layout.previous(getContentPane());
    }
}
