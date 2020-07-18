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
public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new Thread(new Withdraw(account, 6000),"小明");
        Thread t2 = new Thread(new Withdraw(account, 2000),"小華");
        Thread t3 = new Thread(new Withdraw(account, 4000),"小英");
        t1.start();
        t2.start();
        t3.start();
    }
}
