/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project.Models;

import com.cs3560.atm_project.Controllers.AtmController;

/**
 *
 * @author lkbao
 */
public class Withdraw {
    private MachineATM atm;
    private Account account;
    private boolean isCredit;
    /**
     * Constructor for withdraw.
     */
    public Withdraw() {
        atm = MachineATM.getInstance();

        this.isCredit = AtmController.getMenuGUI().getIsCredit();
        if (isCredit) {
            account = new Credit(AtmController.getMenuGUI().getAccountID());
        } else {
            account = new Checking(AtmController.getMenuGUI().getAccountID());
        }
    }
    /**
     * Getter for ATM.
     * @return machineATM.
     */
    public MachineATM getMachineATM() {
        return atm;
    }
    /**
     * Getter for account.
     * @return account.
     */
    public Account getAccount() {
        return account;
    }
    /**
     * Getter if it is credit.
     * @return true if it is credit card, false otherwise.
     */
    public boolean getIsCredit() {
        return isCredit;
    }
   
}
