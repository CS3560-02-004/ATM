/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cs3560.atm_project.Views;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.cs3560.atm_project.Controllers.AtmController;
import com.cs3560.atm_project.Models.Account;
import com.cs3560.atm_project.Models.Checking;
import com.cs3560.atm_project.Models.Credit;
import com.cs3560.atm_project.Models.MachineATM;
import com.cs3560.atm_project.Models.Transaction;
import com.cs3560.atm_project.Models.Withdraw;
/**
 *
 * @author rizen
 */
public class WithdrawWindowGUI extends javax.swing.JPanel {

    /**
     * Creates new form WithdrawWindowGUI
     */
    private long totalWithdraw = 0;
    private int one_denomination = 0;
    private int two_denomination = 0;
    private int five_denomination = 0;
    private int ten_denomination = 0;
    private int twenty_denomination = 0;
    private int fifty_denomination = 0;
    private int hundred_denomination = 0;
    private Withdraw withdraw;
    private ATMMenuGUI menu;
    
    public WithdrawWindowGUI() {
        initComponents();
        initDocumentListeners();
        
    }
    
    
    /**
     * Get the total amount of money currently about to be withdrawn 
     * by looking at home many of each denomination is to be withdrawn.
     */
    private void getTotalWithdraw(){
        totalWithdraw = one_denomination + (two_denomination * 2) + (five_denomination * 5);
        totalWithdraw += (ten_denomination * 10) + (twenty_denomination * 20) + (fifty_denomination * 50);
        totalWithdraw += (hundred_denomination * 100);
    }
    
    /**
     * Updates the total withdraw amount display.
     */
    private void updateTotalWithdraw(){
        getTotalWithdraw();
        withdrawAmount.setText("$" + totalWithdraw + "");
    }
    
    public void updateBalanceText(String balance){
        balanceTextField.setText("$" + balance);
    }
    
    public void updateBalanceHeader(boolean isCredit){
        if(isCredit) balanceHeader.setText("Credit Available");
        else balanceHeader.setText("Balance");
    }
    
    /**
     * Initialize document listeners for all text fields.
     */
    private void initDocumentListeners() {
        oneDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(oneDollarAmount.getText().equals("")) one_denomination = 0;
                else one_denomination = Integer.parseInt(oneDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(oneDollarAmount.getText().equals("")) one_denomination = 0;
                else one_denomination = Integer.parseInt(oneDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(oneDollarAmount.getText().equals("")) one_denomination = 0;
                else one_denomination = Integer.parseInt(oneDollarAmount.getText());
                updateTotalWithdraw();
            }
          });
        
        twoDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(twoDollarAmount.getText().equals("")) two_denomination = 0;
                else two_denomination = Integer.parseInt(twoDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(twoDollarAmount.getText().equals("")) two_denomination = 0;
                else two_denomination = Integer.parseInt(twoDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(twoDollarAmount.getText().equals("")) two_denomination = 0;
                else two_denomination = Integer.parseInt(twoDollarAmount.getText());
                updateTotalWithdraw();
            }
          });
        
        fiveDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(fiveDollarAmount.getText().equals("")) five_denomination = 0;
                else five_denomination = Integer.parseInt(fiveDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(fiveDollarAmount.getText().equals("")) five_denomination = 0;
                else five_denomination = Integer.parseInt(fiveDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(fiveDollarAmount.getText().equals("")) five_denomination = 0;
                else five_denomination = Integer.parseInt(fiveDollarAmount.getText());
                updateTotalWithdraw();
            }
          });
        
        tenDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(tenDollarAmount.getText().equals("")) ten_denomination = 0;
                else ten_denomination = Integer.parseInt(tenDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(tenDollarAmount.getText().equals("")) ten_denomination = 0;
                else ten_denomination = Integer.parseInt(tenDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(tenDollarAmount.getText().equals("")) ten_denomination = 0;
                else ten_denomination = Integer.parseInt(tenDollarAmount.getText());
                updateTotalWithdraw();
            }
          });
        
        twentyDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(twentyDollarAmount.getText().equals("")) twenty_denomination = 0;
                else twenty_denomination = Integer.parseInt(twentyDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(twentyDollarAmount.getText().equals("")) twenty_denomination = 0;
                else twenty_denomination = Integer.parseInt(twentyDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(twentyDollarAmount.getText().equals("")) twenty_denomination = 0;
                else twenty_denomination = Integer.parseInt(twentyDollarAmount.getText());
                updateTotalWithdraw();
            }
          });
        
        fiftyDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(fiftyDollarAmount.getText().equals("")) fifty_denomination = 0;
                else fifty_denomination = Integer.parseInt(fiftyDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(fiftyDollarAmount.getText().equals("")) fifty_denomination = 0;
                else fifty_denomination = Integer.parseInt(fiftyDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(fiftyDollarAmount.getText().equals("")) fifty_denomination = 0;
                else fifty_denomination = Integer.parseInt(fiftyDollarAmount.getText());
                updateTotalWithdraw();
            }
          });
        
        oneHundredDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(oneHundredDollarAmount.getText().equals("")) hundred_denomination = 0;
                else hundred_denomination = Integer.parseInt(oneHundredDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(oneHundredDollarAmount.getText().equals("")) hundred_denomination = 0;
                else hundred_denomination = Integer.parseInt(oneHundredDollarAmount.getText());
                updateTotalWithdraw();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(oneHundredDollarAmount.getText().equals("")) hundred_denomination = 0;
                else hundred_denomination = Integer.parseInt(oneHundredDollarAmount.getText());
                updateTotalWithdraw();
            }
          });
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        withdrawWindowTitle = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        balanceHeader = new javax.swing.JTextField();
        withdrawHeader1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        withdrawAmountTitle = new javax.swing.JTextField();
        withdrawAmount = new javax.swing.JTextField();
        balanceTextField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        twentyDollarAmount = new javax.swing.JTextField();
        fiftyDollarAmount = new javax.swing.JTextField();
        oneHundredDollarAmount = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        depositTwentyDollarTitle = new javax.swing.JLabel();
        depositFiftyDollarTitle = new javax.swing.JLabel();
        depositOneHundredDollarTitle = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        oneDollarAmount = new javax.swing.JTextField();
        twoDollarAmount = new javax.swing.JTextField();
        fiveDollarAmount = new javax.swing.JTextField();
        tenDollarAmount = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        depositOneDollarTitle = new javax.swing.JLabel();
        depositTwoDollarTitle = new javax.swing.JLabel();
        depositFiveDollarTitle = new javax.swing.JLabel();
        depositTenDollarTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        withdrawWindowTitle.setEditable(false);
        withdrawWindowTitle.setBackground(new java.awt.Color(0, 0, 255));
        withdrawWindowTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        withdrawWindowTitle.setForeground(new java.awt.Color(255, 255, 255));
        withdrawWindowTitle.setText("MyCPP Bank");
        withdrawWindowTitle.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(withdrawWindowTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(withdrawWindowTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 33));

        balanceHeader.setEditable(false);
        balanceHeader.setBackground(new java.awt.Color(255, 255, 255));
        balanceHeader.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        balanceHeader.setForeground(new java.awt.Color(0, 0, 255));
        balanceHeader.setText("Balance");
        balanceHeader.setBorder(null);

        withdrawHeader1.setEditable(false);
        withdrawHeader1.setBackground(new java.awt.Color(255, 255, 255));
        withdrawHeader1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        withdrawHeader1.setForeground(new java.awt.Color(0, 0, 255));
        withdrawHeader1.setText("WITHDRAW");
        withdrawHeader1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(balanceHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(265, Short.MAX_VALUE)
                    .addComponent(withdrawHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(245, 245, 245)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(balanceHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(withdrawHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 39));

        withdrawAmountTitle.setEditable(false);
        withdrawAmountTitle.setBackground(new java.awt.Color(255, 255, 255));
        withdrawAmountTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        withdrawAmountTitle.setForeground(new java.awt.Color(0, 0, 255));
        withdrawAmountTitle.setText("AMOUNT:");
        withdrawAmountTitle.setBorder(null);

        withdrawAmount.setEditable(false);
        withdrawAmount.setBackground(new java.awt.Color(255, 255, 255));
        withdrawAmount.setText("0");

        balanceTextField.setEditable(false);
        balanceTextField.setBackground(new java.awt.Color(255, 255, 255));
        balanceTextField.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(withdrawAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(600, 40));

        backButton.setBackground(new java.awt.Color(240, 240, 240));
        backButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 255));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(withdrawButton)
                .addGap(90, 90, 90))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(withdrawButton))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        depositTwentyDollarTitle.setText("$20");

        depositFiftyDollarTitle.setText("$50");

        depositOneHundredDollarTitle.setText("$100");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositTwentyDollarTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(depositFiftyDollarTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(depositOneHundredDollarTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(depositTwentyDollarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositFiftyDollarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositOneHundredDollarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twentyDollarAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiftyDollarAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneHundredDollarAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(twentyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fiftyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(oneHundredDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        depositOneDollarTitle.setText("$1");

        depositTwoDollarTitle.setText("$2");

        depositFiveDollarTitle.setText("$5");

        depositTenDollarTitle.setText("$10");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositOneDollarTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(depositTwoDollarTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(depositFiveDollarTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(depositTenDollarTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(depositOneDollarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositTwoDollarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositFiveDollarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositTenDollarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oneDollarAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoDollarAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveDollarAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenDollarAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(oneDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(twoDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fiveDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tenDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Execute when withdraw button is pressed.
     * @param evt event.
     */
    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        System.out.println("Withdrawing: " + totalWithdraw);
        
        MachineATM machine = MachineATM.getInstance();

        boolean result = machine.reduceQuantity(one_denomination, two_denomination, five_denomination, ten_denomination, twenty_denomination, fifty_denomination, hundred_denomination);
        if(!result){
            JOptionPane.showMessageDialog(this, "There isn't enough denominations in the system, deposit some more money ");
            AtmController.goToScreen("home");
            return;
        }
        
        // withdraw based on if account type (credit or debit). return true if account have sufficient fund.
        // if(ATM_Project.getCheckingAccount() == null){
        if (AtmController.getAccount() instanceof Credit) {
            Credit creditAccount = AtmController.getCreditAccount();
            double remainingCredit = creditAccount.getCreditLimit() - creditAccount.getCreditUsed();
            if((remainingCredit-totalWithdraw) > 0){
               creditAccount.updateCreditUsed(totalWithdraw);
               JOptionPane.showMessageDialog(this, "You have successfully used " + totalWithdraw + " dollars. You have " + (remainingCredit - totalWithdraw) + " remaining.");  
               
               Transaction create = new Transaction(creditAccount.getAccountID(), MachineATM.getInstance().getAtmID(), "Credit Withdraw", "Sucessful");
            } else {
               JOptionPane.showMessageDialog(this, "You can not go over the limit, you have "  + remainingCredit + " credit remaining.");  
            }
                      
        } else {
            double totalAmount = AtmController.getCheckingAccount().getcheckingBalance();
            if((totalAmount-totalWithdraw) > 0){
                AtmController.getCheckingAccount().reduceCheckingBalance(totalWithdraw);
                JOptionPane.showMessageDialog(this, "You have successfully used " + totalWithdraw + " dollars. ");       
                Transaction create = new Transaction(AtmController.getCheckingAccount().getAccountID(), MachineATM.getInstance().getAtmID(), "Checking Withdraw", "Sucessful");
            } else {
               JOptionPane.showMessageDialog(this, "You can not withdraw this much, you have $"  + totalAmount + " in your balance");  
           }

        }
        AtmController.goToScreen("home");

              
        one_denomination = 0;
        two_denomination = 0;
        five_denomination = 0;
        ten_denomination = 0;
        twenty_denomination = 0;
        fifty_denomination = 0;
        hundred_denomination = 0;
        withdrawAmount.setText("0");
        oneDollarAmount.setText("");
        twoDollarAmount.setText("");
        fiveDollarAmount.setText("");
        tenDollarAmount.setText("");
        twentyDollarAmount.setText("");
        fiftyDollarAmount.setText("");
        oneHundredDollarAmount.setText("");
    }//GEN-LAST:event_withdrawButtonActionPerformed
    /**
     * Reset all value back to default.
     * @param evt event.
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        totalWithdraw = 0;
        one_denomination = 0;
        two_denomination = 0;
        five_denomination = 0;
        ten_denomination = 0;
        twenty_denomination = 0;
        fifty_denomination = 0;
        hundred_denomination = 0;
        withdrawAmount.setText("0");
        oneDollarAmount.setText("");
        twoDollarAmount.setText("");
        fiveDollarAmount.setText("");
        tenDollarAmount.setText("");
        twentyDollarAmount.setText("");
        fiftyDollarAmount.setText("");
        oneHundredDollarAmount.setText("");
        AtmController.goToScreen("home");
    }//GEN-LAST:event_backButtonActionPerformed
    
    public void update(Account account) {
        updateBalanceHeader(account.isCredit);
        
        if(account.isCredit){
            Credit credit_account = (Credit)account;
            double available_credit = credit_account.getAvailableCredit();
            String value = String.format("%.2f", available_credit);
            updateBalanceText(value);
        }
        else{
            Checking checking_account = (Checking)account;
            String value = String.format("%.2f", checking_account.getcheckingBalance());
            updateBalanceText(value);            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField balanceHeader;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JLabel depositFiftyDollarTitle;
    private javax.swing.JLabel depositFiveDollarTitle;
    private javax.swing.JLabel depositOneDollarTitle;
    private javax.swing.JLabel depositOneHundredDollarTitle;
    private javax.swing.JLabel depositTenDollarTitle;
    private javax.swing.JLabel depositTwentyDollarTitle;
    private javax.swing.JLabel depositTwoDollarTitle;
    private javax.swing.JTextField fiftyDollarAmount;
    private javax.swing.JTextField fiveDollarAmount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField oneDollarAmount;
    private javax.swing.JTextField oneHundredDollarAmount;
    private javax.swing.JTextField tenDollarAmount;
    private javax.swing.JTextField twentyDollarAmount;
    private javax.swing.JTextField twoDollarAmount;
    private javax.swing.JTextField withdrawAmount;
    private javax.swing.JTextField withdrawAmountTitle;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JTextField withdrawHeader1;
    private javax.swing.JTextField withdrawWindowTitle;
    // End of variables declaration//GEN-END:variables
}
