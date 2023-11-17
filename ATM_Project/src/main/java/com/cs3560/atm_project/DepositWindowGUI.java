/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cs3560.atm_project;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
/**
 *
 * @author gippy
 */
public class DepositWindowGUI extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private long totalDeposit = 0;
    private int one_denomination = 0;
    private int two_denomination = 0;
    private int five_denomination = 0;
    private int ten_denomination = 0;
    private int twenty_denomination = 0;
    private int fifty_denomination = 0;
    private int hundred_denomination = 0;
    
    public DepositWindowGUI() {
        initComponents();
        initDocumentListeners();
    }
    
    // Get the total amount of money currently about to be depositted
    // by looking at home many of each denomination is to be depositted
    private void getTotalDeposit(){   
        totalDeposit = one_denomination + (two_denomination * 2) + (five_denomination * 5);
        totalDeposit += (ten_denomination * 10) + (twenty_denomination * 20) + (fifty_denomination * 50);
        totalDeposit += (hundred_denomination * 100);
    }
    
    // Updates the total deposit amount display
    private void updateTotalDeposit(){
        getTotalDeposit();
        depositAmount.setText(totalDeposit + "");
    }
    
    // Initialize document listeners for all text fields
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

        jPanel4 = new javax.swing.JPanel();
        depositWindowTitle1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        depositHeader = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        depositAmountTitle = new javax.swing.JTextField();
        depositAmount = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        oneDollarAmount = new javax.swing.JTextField();
        depositOneDollarTitle = new javax.swing.JLabel();
        depositTwentyDollarTitle = new javax.swing.JLabel();
        twentyDollarAmount = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        depositTwoDollarTitle = new javax.swing.JLabel();
        twoDollarAmount = new javax.swing.JTextField();
        depositFiftyDollarTitle = new javax.swing.JLabel();
        fiftyDollarAmount = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        depositFiveDollarTitle = new javax.swing.JLabel();
        fiveDollarAmount = new javax.swing.JTextField();
        depositOneHundredDollarTitle = new javax.swing.JLabel();
        oneHundredDollarAmount = new javax.swing.JTextField();
        tenDollarAmount = new javax.swing.JTextField();
        depositTenDollarTitle = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(600, 77));

        depositWindowTitle1.setEditable(false);
        depositWindowTitle1.setBackground(new java.awt.Color(0, 0, 255));
        depositWindowTitle1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        depositWindowTitle1.setForeground(new java.awt.Color(255, 255, 255));
        depositWindowTitle1.setText("MyCPP Bank");
        depositWindowTitle1.setBorder(null);
        depositWindowTitle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositWindowTitle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(depositWindowTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
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
        depositHeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositHeaderActionPerformed(evt);
            }
        });

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
        depositAmountTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAmountTitleActionPerformed(evt);
            }
        });

        depositAmount.setEditable(false);
        depositAmount.setText("0");
        depositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(depositAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 55));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(depositOneDollarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oneDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(depositTwentyDollarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twentyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositOneDollarTitle)
                    .addComponent(depositTwentyDollarTitle)
                    .addComponent(twentyDollarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(140, 140, 140)
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
                .addGap(135, 135, 135)
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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(600, 100));

        backButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 255));
        backButton.setText("BACK");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        depositButton.setBackground(new java.awt.Color(240, 240, 240));
        depositButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        depositButton.setForeground(new java.awt.Color(51, 51, 255));
        depositButton.setText("DEPOSIT");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(depositButton)
                .addGap(60, 60, 60))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void depositWindowTitle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositWindowTitle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositWindowTitle1ActionPerformed

    private void depositHeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositHeaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositHeaderActionPerformed

    private void depositAmountTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAmountTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositAmountTitleActionPerformed

    private void depositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositAmountActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        // TODO add your handling code here:
//        String input = inputField.getText();
//        if (input.length() == 0) input = "0";
//        Double amount = Double.valueOf(input);
    boolean isDepositSuccessful = true;
    if(isDepositSuccessful) JOptionPane.showMessageDialog(this, "Deposit Successful");
    else JOptionPane.showMessageDialog(this, "Deposit Unable to Occur");
    
//        System.out.println("Depositing: " + amount);
    }//GEN-LAST:event_depositButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField oneDollarAmount;
    private javax.swing.JTextField oneHundredDollarAmount;
    private javax.swing.JTextField tenDollarAmount;
    private javax.swing.JTextField twentyDollarAmount;
    private javax.swing.JTextField twoDollarAmount;
    // End of variables declaration//GEN-END:variables
}
