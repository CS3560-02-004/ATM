/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cs3560.atm_project;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
    
    // Get the total amount of money currently about to be withdrawn
    // by looking at home many of each denomination is to be withdrawn
    private void getTotalWithdraw(){
        totalWithdraw = one_denomination + (two_denomination * 2) + (five_denomination * 5);
        totalWithdraw += (ten_denomination * 10) + (twenty_denomination * 20) + (fifty_denomination * 50);
        totalWithdraw += (hundred_denomination * 100);
    }
    
    // Updates the total withdraw amount display
    private void updateTotalWithdraw(){
        getTotalWithdraw();
        withdrawAmount.setText(totalWithdraw + "");
    }
    
    // Initialize document listeners for all text fields
    private void initDocumentListeners(){
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
        jPanel1 = new javax.swing.JPanel();
        withdrawHeader = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        withdrawAmountTitle = new javax.swing.JTextField();
        withdrawAmount = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        depositFiveDollarTitle = new javax.swing.JLabel();
        fiveDollarAmount = new javax.swing.JTextField();
        depositOneHundredDollarTitle = new javax.swing.JLabel();
        oneHundredDollarAmount = new javax.swing.JTextField();
        tenDollarAmount = new javax.swing.JTextField();
        depositTenDollarTitle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        depositTwoDollarTitle = new javax.swing.JLabel();
        twoDollarAmount = new javax.swing.JTextField();
        depositFiftyDollarTitle = new javax.swing.JLabel();
        fiftyDollarAmount = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        oneDollarAmount = new javax.swing.JTextField();
        depositOneDollarTitle = new javax.swing.JLabel();
        depositTwentyDollarTitle = new javax.swing.JLabel();
        twentyDollarAmount = new javax.swing.JTextField();

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

        withdrawWindowTitle.setEditable(false);
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
                .addContainerGap(252, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(withdrawHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 39));

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

        withdrawAmount.setEditable(false);
        withdrawAmount.setText("0");
        withdrawAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(withdrawAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(89, 89, 89)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(withdrawButton)
                .addGap(86, 86, 86))
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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(600, 54));

        depositFiveDollarTitle.setText("$5");

        fiveDollarAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveDollarAmountActionPerformed(evt);
            }
        });

        depositOneHundredDollarTitle.setText("$100");

        oneHundredDollarAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneHundredDollarAmountActionPerformed(evt);
            }
        });

        tenDollarAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenDollarAmountActionPerformed(evt);
            }
        });

        depositTenDollarTitle.setText("$10");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(depositFiveDollarTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(depositTenDollarTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tenDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addComponent(depositOneHundredDollarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oneHundredDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositFiveDollarTitle)
                    .addComponent(fiveDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositOneHundredDollarTitle)
                    .addComponent(oneHundredDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositTenDollarTitle))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 40));

        depositTwoDollarTitle.setText("$2");

        twoDollarAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoDollarAmountActionPerformed(evt);
            }
        });

        depositFiftyDollarTitle.setText("$50");

        fiftyDollarAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiftyDollarAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(depositTwoDollarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twoDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(depositFiftyDollarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fiftyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositTwoDollarTitle)
                    .addComponent(twoDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositFiftyDollarTitle)
                    .addComponent(fiftyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(600, 55));

        oneDollarAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneDollarAmountActionPerformed(evt);
            }
        });

        depositOneDollarTitle.setText("$1");

        depositTwentyDollarTitle.setText("$20");

        twentyDollarAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentyDollarAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(depositOneDollarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oneDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(depositTwentyDollarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twentyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositOneDollarTitle)
                    .addComponent(depositTwentyDollarTitle)
                    .addComponent(twentyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
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
        System.out.println("Withdrawing: " + totalWithdraw);
        withdraw = new Withdraw();
        
        boolean isWithdrawSuccessful = false;
        boolean accountWithdraw = false;
        boolean atmWithdraw = false;
        if (withdraw.getIsCredit()) {
            Credit credit = (Credit)(withdraw.getAccount());
            accountWithdraw =  credit.updateCreditUsed(totalWithdraw);
        } else {
            Checking check = (Checking)(withdraw.getAccount());
            accountWithdraw = check.updateCheckingBalance(totalWithdraw);
        }
        atmWithdraw = withdraw.getMachineATM().reduceQuantity(one_denomination, two_denomination, five_denomination, ten_denomination, twenty_denomination, fifty_denomination, hundred_denomination);
        
        if (accountWithdraw == true && atmWithdraw == true) {
            isWithdrawSuccessful = true;
        }
        
        if(isWithdrawSuccessful) JOptionPane.showMessageDialog(this, "Withdraw Successful");
        else JOptionPane.showMessageDialog(this, "Withdraw Unable to Occur");
    }//GEN-LAST:event_withdrawButtonActionPerformed

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
        ATM_Project.goToScreen("home");
    }//GEN-LAST:event_backButtonActionPerformed

    private void fiftyDollarAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiftyDollarAmountActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fiftyDollarAmountActionPerformed

    private void oneDollarAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneDollarAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneDollarAmountActionPerformed

    private void twoDollarAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoDollarAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoDollarAmountActionPerformed

    private void fiveDollarAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveDollarAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiveDollarAmountActionPerformed

    private void tenDollarAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenDollarAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenDollarAmountActionPerformed

    private void twentyDollarAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentyDollarAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twentyDollarAmountActionPerformed

    private void oneHundredDollarAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneHundredDollarAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneHundredDollarAmountActionPerformed
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField DepositHeader;
    private javax.swing.JButton backButton;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField oneDollarAmount;
    private javax.swing.JTextField oneHundredDollarAmount;
    private javax.swing.JTextField tenDollarAmount;
    private javax.swing.JTextField twentyDollarAmount;
    private javax.swing.JTextField twoDollarAmount;
    private javax.swing.JTextField withdrawAmount;
    private javax.swing.JTextField withdrawAmountTitle;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JTextField withdrawHeader;
    private javax.swing.JTextField withdrawWindowTitle;
    // End of variables declaration//GEN-END:variables
}
