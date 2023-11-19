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
    
    public Withdraw(int atmID, int accountID, boolean isCredit) {
        this.atm = new MachineATM(atmID);
        this.isCredit = isCredit;
        if (isCredit) {
            account = new Credit(accountID);
        } else {
            account = new Checking(accountID);
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
