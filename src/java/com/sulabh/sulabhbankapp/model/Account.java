/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulabh.sulabhbankapp.model;

public class Account {
    Integer accountNo;
    String accountHolderName;
    Integer balance;

    public Account() {
        this.accountNo = 0;
        this.accountHolderName = "";
        this.balance = 0;
    }

    public Account(Integer accountNo, String accountHolderName, Integer balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
      
}
