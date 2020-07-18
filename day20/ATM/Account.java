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
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    
    public void print(){
        System.out.printf("帳戶餘額: %d\n",balance);
    }
    public synchronized void withdraw(int money){
        String tname = Thread.currentThread().getName();
        //目前帳戶餘額
        int cur_balance = balance;
        if(cur_balance>=money){
            cur_balance-=money;
            balance = cur_balance;
            System.out.printf("%s 提款 $%d成功 餘額: $%d\n",tname, money, balance);
        }else{
            System.out.printf("%s 提款失敗 餘額不足\n",tname);
        }
    }
}
