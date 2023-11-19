/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs3560.atm_project;

/**
 *
 * @author lkbao
 */
public class Withdraw {
    private MachineATM atm;
    private Account account;
    private boolean isCredit;
    
    public Withdraw() {
        this.atm = new MachineATM();
        this.isCredit = ATM_Project.getMenuGUI().getIsCredit();
        if (isCredit) {
            account = new Credit(ATM_Project.getMenuGUI().getAccountID());
        } else {
            account = new Checking(ATM_Project.getMenuGUI().getAccountID());
        }
    }
    
    public MachineATM getMachineATM() {
        return atm;
    }
    public Account getAccount() {
        return account;
    }
    public boolean getIsCredit() {
        return isCredit;
    }
    
}
