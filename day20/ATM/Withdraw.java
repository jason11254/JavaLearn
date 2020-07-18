/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.ATM;

/**
 *
 * @author MB-study
 */
public class Withdraw implements Runnable{
    private Account account;
    private int money;

    public Withdraw(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.withdraw(money);
    }
    
    
}
