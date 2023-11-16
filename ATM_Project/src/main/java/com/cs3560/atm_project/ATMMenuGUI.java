/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cs3560.atm_project;

/**
 *
 * @author rizen   
 */
public class ATMMenuGUI extends javax.swing.JPanel {

    /**
     * Creates new form HomeScreen
     */
    public ATMMenuGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        HEADER2 = new javax.swing.JTextField();
        SUBHEADER = new javax.swing.JTextField();
        DEPOSITBTN = new javax.swing.JButton();
        TRANSFERBTN = new javax.swing.JButton();
        WITHDRAWBTN = new javax.swing.JButton();
        LOGOUT = new javax.swing.JTextField();
        FOOTER = new javax.swing.JTextField();
        BALANCEBTN = new javax.swing.JButton();

        jPanel6.setBackground(new java.awt.Color(0, 0, 255));

        HEADER2.setBackground(new java.awt.Color(0, 0, 255));
        HEADER2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        HEADER2.setForeground(new java.awt.Color(255, 255, 255));
        HEADER2.setText("Welcome to MyCPP Bank");
        HEADER2.setBorder(null);
        HEADER2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HEADER2ActionPerformed(evt);
            }
        });

        SUBHEADER.setBackground(new java.awt.Color(0, 0, 255));
        SUBHEADER.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SUBHEADER.setForeground(new java.awt.Color(255, 255, 255));
        SUBHEADER.setText("Please Select Your Transaction");
        SUBHEADER.setBorder(null);
        SUBHEADER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBHEADERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(HEADER2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(SUBHEADER, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(HEADER2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SUBHEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        DEPOSITBTN.setBackground(new java.awt.Color(240, 240, 240));
        DEPOSITBTN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        DEPOSITBTN.setText("DEPOSIT");
        DEPOSITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTNActionPerformed(evt);
            }
        });

        TRANSFERBTN.setBackground(new java.awt.Color(240, 240, 240));
        TRANSFERBTN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TRANSFERBTN.setText("TRANSFER");
        TRANSFERBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSFERBTNActionPerformed(evt);
            }
        });

        WITHDRAWBTN.setBackground(new java.awt.Color(240, 240, 240));
        WITHDRAWBTN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        WITHDRAWBTN.setText("WITHDRAW");
        WITHDRAWBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWBTNActionPerformed(evt);
            }
        });

        LOGOUT.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(255, 51, 51));
        LOGOUT.setText("LOGOUT");
        LOGOUT.setBorder(null);
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });

        FOOTER.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        FOOTER.setForeground(new java.awt.Color(51, 51, 255));
        FOOTER.setText("MyCPP Bank");
        FOOTER.setBorder(null);
        FOOTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOOTERActionPerformed(evt);
            }
        });

        BALANCEBTN.setBackground(new java.awt.Color(240, 240, 240));
        BALANCEBTN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        BALANCEBTN.setText("BALANCE");
        BALANCEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BALANCEBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TRANSFERBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(WITHDRAWBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                                    .addComponent(BALANCEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(108, 108, 108))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(FOOTER, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(271, 271, 271))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(286, 286, 286)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DEPOSITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TRANSFERBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(42, 42, 42)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(WITHDRAWBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BALANCEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                    .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(FOOTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HEADER2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HEADER2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HEADER2ActionPerformed

    private void SUBHEADERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBHEADERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUBHEADERActionPerformed

    private void DEPOSITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTNActionPerformed
        ATM_Project.goToScreen("deposit");
    }//GEN-LAST:event_DEPOSITBTNActionPerformed

    private void TRANSFERBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSFERBTNActionPerformed
        ATM_Project.goToScreen("transfer");
    }//GEN-LAST:event_TRANSFERBTNActionPerformed

    private void WITHDRAWBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAWBTNActionPerformed
        ATM_Project.goToScreen("withdraw");
    }//GEN-LAST:event_WITHDRAWBTNActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        ATM_Project.goToScreen("login");
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void FOOTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOOTERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FOOTERActionPerformed

    private void BALANCEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BALANCEBTNActionPerformed
        ATM_Project.goToScreen("balance");
    }//GEN-LAST:event_BALANCEBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BALANCEBTN;
    private javax.swing.JButton DEPOSITBTN;
    private javax.swing.JTextField FOOTER;
    private javax.swing.JTextField HEADER;
    private javax.swing.JTextField HEADER1;
    private javax.swing.JTextField HEADER2;
    private javax.swing.JTextField LOGOUT;
    private javax.swing.JTextField SUBHEADER;
    private javax.swing.JButton TRANSFERBTN;
    private javax.swing.JButton WITHDRAWBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}