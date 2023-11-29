/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cs3560.atm_project.Views;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import com.cs3560.atm_project.Controllers.AtmController;
import com.cs3560.atm_project.Models.Checking;
import com.cs3560.atm_project.Models.Credit;
import com.cs3560.atm_project.Models.DatabaseConnection;
import com.cs3560.atm_project.Models.MachineATM;



public class LoginGUI extends javax.swing.JPanel {
    int atmID = 1;
    InsertPinGUI pinGUI;
    DepositWindowGUI depositGUI;
    
    private final String GET_CARD = "SELECT * FROM CARD WHERE cardNumber = "; 
    
    public LoginGUI() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        HEADER = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        label3 = new java.awt.Label();
        panel2 = new java.awt.Panel();
        cardNumberInput = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        panel3 = new java.awt.Panel();
        loginButton = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        HEADER.setEditable(false);
        HEADER.setBackground(new java.awt.Color(0, 0, 255));
        HEADER.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        HEADER.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.setText("MyCPP Bank");
        HEADER.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panel1.setPreferredSize(new java.awt.Dimension(600, 45));

        label3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 255));
        label3.setText("LOGIN");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cardNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberInputActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 255));
        label2.setText("Card Number");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(cardNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(cardNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel3.setPreferredSize(new java.awt.Dimension(600, 37));

        loginButton.setBackground(new java.awt.Color(240, 240, 240));
        loginButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 51, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        label1.setText("label1");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberInputActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String input = cardNumberInput.getText();
        if(input.equals("")) return; // Quit operation if e
        
        int validInput = validateCardNumber(input);// validateCardNumber(input);
        
        
        if (validInput == 0) {
            cardNumberInput.setText("");
            AtmController.goToScreen("pin");
        } else if (validInput == 1) {
            AtmController.goToScreen("home");
        } else {
            JOptionPane.showMessageDialog(null, "Your Card is not in the system!",
           "Card Validator", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * Validate card number.
     * @param cardNumber String to be validate.
     * @return 0 if card is not a credit card.
     *          1 if card is a credit card.
     *          2 if card is not in the system.
     */
    private int validateCardNumber(String cardNumber) {
        // default not found
        int cardValidation = 2;
        
        int accountID;
        int pin;
        boolean isCredit;
        DatabaseConnection db = new DatabaseConnection();
        ResultSet rs = db.getQuery(String.format(GET_CARD + cardNumber));
        try {
            // check if any value return from database
            if (rs.next() == false) {
                System.out.println("Card number not found in database");
            // get value
            } else {
                do {
                    accountID = rs.getInt("accountID");
                    pin = rs.getInt("fourDigitPin");
                    isCredit = rs.getBoolean("isCredit");

                } while (rs.next());
                
                // check if card is a credit card
                if (isCredit == true) {
                    cardValidation = 1;
                    
                } else {
                    pinGUI = AtmController.getInsertPinGUI();
                    pinGUI.setCorrectPIN(pin);
                    // AtmController.getCheckingAccount().setCorrectPin(pin);
                    cardValidation = 0;
                    // Debug
                    System.out.println("It is Credit " + pin);
                }
                
                // Update account data into menuGUI so it is accessible to all features
                if (isCredit) AtmController.setAccount(new Credit(accountID));
                else AtmController.setAccount(new Checking(accountID));
                
                menuGUI.customer = new Customer(accountID);
                
                // Update GUI of getBalance
                // AtmController.updateBalanceGUI(isCredit);
                
                // Store important data into menuGUI
                MachineATM.storeAtmID(atmID);
                MachineATM.storeIsCredit(isCredit);
                
                depositGUI = new DepositWindowGUI();
                depositGUI.setAccountID(accountID);
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cardValidation;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HEADER;
    private javax.swing.JTextField cardNumberInput;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JButton loginButton;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    // End of variables declaration//GEN-END:variables
}
