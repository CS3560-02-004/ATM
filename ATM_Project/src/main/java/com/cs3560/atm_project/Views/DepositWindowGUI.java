/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cs3560.atm_project.Views;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;

import com.cs3560.atm_project.Controllers.AtmController;
import com.cs3560.atm_project.Models.MachineATM;
import com.cs3560.atm_project.Models.Transaction;

import javax.swing.event.DocumentEvent;
/**
 *
 * @author gippy
 */
public class DepositWindowGUI extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private double totalDeposit = 0;
    private int one_denomination = 0;
    private int two_denomination = 0;
    private int five_denomination = 0;
    private int ten_denomination = 0;
    private int twenty_denomination = 0;
    private int fifty_denomination = 0;
    private int hundred_denomination = 0;
    private static int currentAccountID;
    
    public DepositWindowGUI() {
        initComponents();
        initDocumentListeners();
    }
    
    /**
     * Get the total amount of money currently about to be deposited by looking at home many of each denomination is to be deposited.
     */
    private void getTotalDeposit(){   
        totalDeposit = one_denomination + (two_denomination * 2) + (five_denomination * 5);
        totalDeposit += (ten_denomination * 10) + (twenty_denomination * 20) + (fifty_denomination * 50);
        totalDeposit += (hundred_denomination * 100);
    }
    
    /**
     * Updates the total deposit amount display.
     */
    private void updateTotalDeposit(){
        getTotalDeposit();
        depositAmount.setText(totalDeposit + "");
    }
    
    /**
     * Initialize document listeners for all text fields.
     */
    private void initDocumentListeners(){
        oneDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(oneDollarAmount.getText().equals("")) one_denomination = 0;
                else one_denomination = Integer.parseInt(oneDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(oneDollarAmount.getText().equals("")) one_denomination = 0;
                else one_denomination = Integer.parseInt(oneDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(oneDollarAmount.getText().equals("")) one_denomination = 0;
                else one_denomination = Integer.parseInt(oneDollarAmount.getText());
                updateTotalDeposit();
            }
          });
        
        twoDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(twoDollarAmount.getText().equals("")) two_denomination = 0;
                else two_denomination = Integer.parseInt(twoDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(twoDollarAmount.getText().equals("")) two_denomination = 0;
                else two_denomination = Integer.parseInt(twoDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(twoDollarAmount.getText().equals("")) two_denomination = 0;
                else two_denomination = Integer.parseInt(twoDollarAmount.getText());
                updateTotalDeposit();
            }
          });
        
        fiveDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(fiveDollarAmount.getText().equals("")) five_denomination = 0;
                else five_denomination = Integer.parseInt(fiveDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(fiveDollarAmount.getText().equals("")) five_denomination = 0;
                else five_denomination = Integer.parseInt(fiveDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(fiveDollarAmount.getText().equals("")) five_denomination = 0;
                else five_denomination = Integer.parseInt(fiveDollarAmount.getText());
                updateTotalDeposit();
            }
          });
        
        tenDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(tenDollarAmount.getText().equals("")) ten_denomination = 0;
                else ten_denomination = Integer.parseInt(tenDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(tenDollarAmount.getText().equals("")) ten_denomination = 0;
                else ten_denomination = Integer.parseInt(tenDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(tenDollarAmount.getText().equals("")) ten_denomination = 0;
                else ten_denomination = Integer.parseInt(tenDollarAmount.getText());
                updateTotalDeposit();
            }
          });
        
        twentyDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(twentyDollarAmount.getText().equals("")) twenty_denomination = 0;
                else twenty_denomination = Integer.parseInt(twentyDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(twentyDollarAmount.getText().equals("")) twenty_denomination = 0;
                else twenty_denomination = Integer.parseInt(twentyDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(twentyDollarAmount.getText().equals("")) twenty_denomination = 0;
                else twenty_denomination = Integer.parseInt(twentyDollarAmount.getText());
                updateTotalDeposit();
            }
          });
        
        fiftyDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(fiftyDollarAmount.getText().equals("")) fifty_denomination = 0;
                else fifty_denomination = Integer.parseInt(fiftyDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(fiftyDollarAmount.getText().equals("")) fifty_denomination = 0;
                else fifty_denomination = Integer.parseInt(fiftyDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(fiftyDollarAmount.getText().equals("")) fifty_denomination = 0;
                else fifty_denomination = Integer.parseInt(fiftyDollarAmount.getText());
                updateTotalDeposit();
            }
          });
        
        oneHundredDollarAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(oneHundredDollarAmount.getText().equals("")) hundred_denomination = 0;
                else hundred_denomination = Integer.parseInt(oneHundredDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(oneHundredDollarAmount.getText().equals("")) hundred_denomination = 0;
                else hundred_denomination = Integer.parseInt(oneHundredDollarAmount.getText());
                updateTotalDeposit();
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(oneHundredDollarAmount.getText().equals("")) hundred_denomination = 0;
                else hundred_denomination = Integer.parseInt(oneHundredDollarAmount.getText());
                updateTotalDeposit();
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

        jPanel5 = new javax.swing.JPanel();
        depositWindowTitle1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        depositHeader = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        depositAmountTitle = new javax.swing.JTextField();
        depositAmount = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        depositButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
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

        jPanel5.setBackground(new java.awt.Color(0, 0, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 77));

        depositWindowTitle1.setEditable(false);
        depositWindowTitle1.setBackground(new java.awt.Color(0, 0, 255));
        depositWindowTitle1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        depositWindowTitle1.setForeground(new java.awt.Color(255, 255, 255));
        depositWindowTitle1.setText("MyCPP Bank");
        depositWindowTitle1.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(depositWindowTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(depositWindowTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 48));

        depositHeader.setEditable(false);
        depositHeader.setBackground(new java.awt.Color(255, 255, 255));
        depositHeader.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        depositHeader.setForeground(new java.awt.Color(0, 0, 255));
        depositHeader.setText("DEPOSIT");
        depositHeader.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(depositHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 46));

        depositAmountTitle.setEditable(false);
        depositAmountTitle.setBackground(new java.awt.Color(255, 255, 255));
        depositAmountTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        depositAmountTitle.setForeground(new java.awt.Color(0, 0, 255));
        depositAmountTitle.setText("AMOUNT:");
        depositAmountTitle.setBorder(null);

        depositAmount.setEditable(false);
        depositAmount.setBackground(new java.awt.Color(255, 255, 255));
        depositAmount.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(depositAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(600, 100));

        depositButton.setBackground(new java.awt.Color(240, 240, 240));
        depositButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        depositButton.setForeground(new java.awt.Color(51, 51, 255));
        depositButton.setText("DEPOSIT");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(backButton)
                .addGap(217, 217, 217)
                .addComponent(depositButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(0, 6, Short.MAX_VALUE))
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
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        System.out.println(totalDeposit);
        System.out.println(currentAccountID);
        AtmController.getCheckingAccount().updateCheckingBalance(totalDeposit);
        JOptionPane.showMessageDialog(this, "You have successfully deposited " + totalDeposit + " dollars.");
        Transaction create = new Transaction(AtmController.getCheckingAccount().getAccountID(), MachineATM.getInstance().getAtmID(), "Deposit", "Sucessful");
         
        MachineATM machine = MachineATM.getInstance();
        machine.increaseQuantity(one_denomination, two_denomination, five_denomination, ten_denomination, twenty_denomination, fifty_denomination, hundred_denomination);
        totalDeposit = 0;
        one_denomination = 0;
        two_denomination = 0;
        five_denomination = 0;
        ten_denomination = 0;
        twenty_denomination = 0;
        fifty_denomination = 0;
        hundred_denomination = 0;
        depositAmount.setText("0");
        oneDollarAmount.setText("");
        twoDollarAmount.setText("");
        fiveDollarAmount.setText("");
        tenDollarAmount.setText("");
        twentyDollarAmount.setText("");
        fiftyDollarAmount.setText("");
        oneHundredDollarAmount.setText("");
        AtmController.goToScreen("home");
    }//GEN-LAST:event_depositButtonActionPerformed

    public void setAccountID(int accountID){
        currentAccountID = accountID;
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        totalDeposit = 0;
        one_denomination = 0;
        two_denomination = 0;
        five_denomination = 0;
        ten_denomination = 0;
        twenty_denomination = 0;
        fifty_denomination = 0;
        hundred_denomination = 0;
        depositAmount.setText("0");
        oneDollarAmount.setText("");
        twoDollarAmount.setText("");
        fiveDollarAmount.setText("");
        tenDollarAmount.setText("");
        twentyDollarAmount.setText("");
        fiftyDollarAmount.setText("");
        oneHundredDollarAmount.setText("");
        AtmController.goToScreen("home");
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField depositAmount;
    private javax.swing.JTextField depositAmountTitle;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel depositFiftyDollarTitle;
    private javax.swing.JLabel depositFiveDollarTitle;
    private javax.swing.JTextField depositHeader;
    private javax.swing.JLabel depositOneDollarTitle;
    private javax.swing.JLabel depositOneHundredDollarTitle;
    private javax.swing.JLabel depositTenDollarTitle;
    private javax.swing.JLabel depositTwentyDollarTitle;
    private javax.swing.JLabel depositTwoDollarTitle;
    private javax.swing.JTextField depositWindowTitle1;
    private javax.swing.JTextField fiftyDollarAmount;
    private javax.swing.JTextField fiveDollarAmount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField oneDollarAmount;
    private javax.swing.JTextField oneHundredDollarAmount;
    private javax.swing.JTextField tenDollarAmount;
    private javax.swing.JTextField twentyDollarAmount;
    private javax.swing.JTextField twoDollarAmount;
    // End of variables declaration//GEN-END:variables
}
