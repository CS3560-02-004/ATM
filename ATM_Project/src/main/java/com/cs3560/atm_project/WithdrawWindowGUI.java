/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cs3560.atm_project;

/**
 *
 * @author rizen
 */
public class WithdrawWindowGUI extends javax.swing.JPanel {

    /**
     * Creates new form WithdrawWindowGUI
     */
    public WithdrawWindowGUI() {
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

        DepositHeader = new javax.swing.JTextField();
        Amount = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        withdrawWindowTitle = new javax.swing.JTextField();
        withdrawHeader = new javax.swing.JTextField();
        withdrawAmountTitle = new javax.swing.JTextField();
        withdrawAmount = new javax.swing.JTextField();
        oneDollarAmount = new javax.swing.JTextField();
        twoDollarAmount = new javax.swing.JTextField();
        fiveDollarAmount = new javax.swing.JTextField();
        tenDollarAmount = new javax.swing.JTextField();
        twentyDollarAmount = new javax.swing.JTextField();
        fiftyDollarAmount = new javax.swing.JTextField();
        oneHundredDollarAmount = new javax.swing.JTextField();
        withdrawButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        oneDollarTitle = new javax.swing.JLabel();
        twoDollarTitle = new javax.swing.JLabel();
        fiveDollarTitle = new javax.swing.JLabel();
        tenDollarTitle = new javax.swing.JLabel();
        twentyDollarTitle = new javax.swing.JLabel();
        fiftyDollarTitle = new javax.swing.JLabel();
        oneHundredDollarTitle = new javax.swing.JLabel();

        DepositHeader.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        DepositHeader.setForeground(new java.awt.Color(0, 0, 255));
        DepositHeader.setText("DEPOSIT");
        DepositHeader.setBorder(null);
        DepositHeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositHeaderActionPerformed(evt);
            }
        });

        Amount.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Amount.setForeground(new java.awt.Color(0, 0, 255));
        Amount.setText("AMOUNT:");
        Amount.setBorder(null);
        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField5.setText("$2");
        jTextField5.setBorder(null);

        jTextField10.setText("$10");
        jTextField10.setBorder(null);

        jTextField13.setText("$20");
        jTextField13.setBorder(null);

        jTextField16.setText("$50");
        jTextField16.setBorder(null);

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        withdrawWindowTitle.setBackground(new java.awt.Color(0, 0, 255));
        withdrawWindowTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        withdrawWindowTitle.setForeground(new java.awt.Color(255, 255, 255));
        withdrawWindowTitle.setText("MyCPP Bank");
        withdrawWindowTitle.setBorder(null);
        withdrawWindowTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawWindowTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(withdrawWindowTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(withdrawWindowTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        withdrawHeader.setEditable(false);
        withdrawHeader.setBackground(new java.awt.Color(255, 255, 255));
        withdrawHeader.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        withdrawHeader.setForeground(new java.awt.Color(0, 0, 255));
        withdrawHeader.setText("WITHDRAW");
        withdrawHeader.setBorder(null);
        withdrawHeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawHeaderActionPerformed(evt);
            }
        });

        withdrawAmountTitle.setEditable(false);
        withdrawAmountTitle.setBackground(new java.awt.Color(255, 255, 255));
        withdrawAmountTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        withdrawAmountTitle.setForeground(new java.awt.Color(0, 0, 255));
        withdrawAmountTitle.setText("AMOUNT:");
        withdrawAmountTitle.setBorder(null);
        withdrawAmountTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawAmountTitleActionPerformed(evt);
            }
        });

        withdrawAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawAmountActionPerformed(evt);
            }
        });

        withdrawButton.setBackground(new java.awt.Color(240, 240, 240));
        withdrawButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(51, 51, 255));
        withdrawButton.setText("WITHDRAW");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(240, 240, 240));
        backButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 255));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        oneDollarTitle.setText("$1");

        twoDollarTitle.setText("$2");

        fiveDollarTitle.setText("$5");

        tenDollarTitle.setText("$10");

        twentyDollarTitle.setText("$20");

        fiftyDollarTitle.setText("$50");

        oneHundredDollarTitle.setText("$100");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(oneDollarTitle)
                    .addComponent(twoDollarTitle)
                    .addComponent(fiveDollarTitle)
                    .addComponent(tenDollarTitle))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tenDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(withdrawAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(withdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fiveDollarAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twoDollarAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(oneDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(twentyDollarTitle)
                                    .addComponent(fiftyDollarTitle)
                                    .addComponent(oneHundredDollarTitle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fiftyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twentyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oneHundredDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(withdrawButton)
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(withdrawHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneDollarTitle)
                    .addComponent(twentyDollarTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiftyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoDollarTitle)
                    .addComponent(fiftyDollarTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiveDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneHundredDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveDollarTitle)
                    .addComponent(oneHundredDollarTitle))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenDollarTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawButton)
                    .addComponent(backButton))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawWindowTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawWindowTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawWindowTitleActionPerformed

    private void DepositHeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositHeaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositHeaderActionPerformed

    private void withdrawHeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawHeaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawHeaderActionPerformed

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountActionPerformed

    private void withdrawAmountTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawAmountTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawAmountTitleActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void withdrawAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawAmountActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        // TODO add your handling code here:
        String input = withdrawAmount.getText();
        if (input.length() == 0) input = "0";
        Double amount = Double.valueOf(input);
        
        System.out.println("Withdrawing: " + amount);
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ATM_Project.goToScreen("home");
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField DepositHeader;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField fiftyDollarAmount;
    private javax.swing.JLabel fiftyDollarTitle;
    private javax.swing.JTextField fiveDollarAmount;
    private javax.swing.JLabel fiveDollarTitle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField oneDollarAmount;
    private javax.swing.JLabel oneDollarTitle;
    private javax.swing.JTextField oneHundredDollarAmount;
    private javax.swing.JLabel oneHundredDollarTitle;
    private javax.swing.JTextField tenDollarAmount;
    private javax.swing.JLabel tenDollarTitle;
    private javax.swing.JTextField twentyDollarAmount;
    private javax.swing.JLabel twentyDollarTitle;
    private javax.swing.JTextField twoDollarAmount;
    private javax.swing.JLabel twoDollarTitle;
    private javax.swing.JTextField withdrawAmount;
    private javax.swing.JTextField withdrawAmountTitle;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JTextField withdrawHeader;
    private javax.swing.JTextField withdrawWindowTitle;
    // End of variables declaration//GEN-END:variables
}
