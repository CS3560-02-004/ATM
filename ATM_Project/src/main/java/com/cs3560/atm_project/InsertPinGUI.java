/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cs3560.atm_project;

import javax.swing.JOptionPane;

/**
 *
 * @author gippy
 */
public class InsertPinGUI extends javax.swing.JPanel {

    /**
     * Creates new form Insert_Pin_GUI
     */
    private byte retry_counter = 3;
    
    /**
     * Creates new form InsertPinGUI
     */
    public InsertPinGUI() {
        initComponents();
        setSize(600, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        enterPinField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        enterPinButton = new javax.swing.JButton();
        insertPinReturnButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel4.setBackground(new java.awt.Color(102, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CPP ATM System");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Insert Pin");

        enterPinField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        enterPinField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterPinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPinFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PIN");

        enterPinButton.setText("Enter");
        enterPinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPinButtonActionPerformed(evt);
            }
        });

        insertPinReturnButton.setText("Return");
        insertPinReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPinReturnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(enterPinField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insertPinReturnButton)
                                    .addComponent(enterPinButton))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterPinField, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(enterPinButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertPinReturnButton)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterPinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterPinFieldActionPerformed

    private void enterPinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPinButtonActionPerformed
        // TODO add your handling code here:
        String retry_message = "Your PIN is incorrect, you have " + retry_counter + " attempts left";
        JOptionPane.showMessageDialog(this, retry_message);
    }//GEN-LAST:event_enterPinButtonActionPerformed

    private void insertPinReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPinReturnButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPinReturnButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterPinButton;
    private javax.swing.JPasswordField enterPinField;
    private javax.swing.JButton insertPinReturnButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
