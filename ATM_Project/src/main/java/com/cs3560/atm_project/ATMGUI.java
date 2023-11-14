package com.cs3560.atm_project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rizen
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMGUI {

    private double balance = 1000.0;
    private JTextField depositAmountField;
    private JTextField withdrawAmountField;
    private JTextField transferAmountField;
    private JLabel balanceLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ATMGUI().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("ATM Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE); // Set background color to blue
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        JLabel depositLabel = new JLabel("Deposit Amount:");
        depositLabel.setBounds(10, 20, 120, 25);
        panel.add(depositLabel);

        depositAmountField = new JTextField(20);
        depositAmountField.setBounds(140, 20, 120, 25);
        panel.add(depositAmountField);

        JLabel withdrawLabel = new JLabel("Withdraw Amount:");
        withdrawLabel.setBounds(10, 50, 120, 25);
        panel.add(withdrawLabel);

        withdrawAmountField = new JTextField(20);
        withdrawAmountField.setBounds(140, 50, 120, 25);
        panel.add(withdrawAmountField);

        JLabel transferLabel = new JLabel("Transfer Amount:");
        transferLabel.setBounds(10, 80, 120, 25);
        panel.add(transferLabel);

        transferAmountField = new JTextField(20);
        transferAmountField.setBounds(140, 80, 120, 25);
        panel.add(transferAmountField);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(10, 110, 80, 25);
        panel.add(depositButton);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(100, 110, 90, 25);
        panel.add(withdrawButton);

        JButton transferButton = new JButton("Transfer");
        transferButton.setBounds(200, 110, 90, 25);
        panel.add(transferButton);

        balanceLabel = new JLabel("Balance: $1000.00");
        balanceLabel.setBounds(10, 140, 150, 25);
        panel.add(balanceLabel);

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleDeposit();
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleWithdraw();
            }
        });

        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleTransfer();
            }
        });
    }

    private void handleDeposit() {
        performTransaction(depositAmountField, "Deposit");
    }

    private void handleWithdraw() {
        performTransaction(withdrawAmountField, "Withdraw");
    }

    private void handleTransfer() {
        performTransaction(transferAmountField, "Transfer");
    }

    private void performTransaction(JTextField amountField, String transactionType) {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount > 0) {
                if ("Withdraw".equals(transactionType) && amount > balance) {
                    showErrorMessage("Insufficient Funds", "You do not have enough balance for this withdrawal.");
                } else {
                    if ("Withdraw".equals(transactionType) || "Transfer".equals(transactionType)) {
                        balance -= amount;
                    } else {
                        balance += amount;
                    }
                    updateBalanceLabel();
                }
            } else {
                showErrorMessage("Invalid Input", "Please enter a valid " + transactionType.toLowerCase() + " amount.");
            }
        } catch (NumberFormatException e) {
            showErrorMessage("Invalid Input", "Please enter a valid number.");
        }
    }

    private void updateBalanceLabel() {
        balanceLabel.setText("Balance: $" + String.format("%.2f", balance));
    }

    private void showErrorMessage(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }
}
