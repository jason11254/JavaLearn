/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day01;

/**
 *
 * @author MB-study
 */
public class Account {

    private String name;
    private int balance;
    
    boolean hasName(){
        return name!=null ? true : false;
    }
    
    public void setName(String name) {
        if(name!=null){
            name=name.trim();
            if(name.length()<=10)
                this.name = name;
            else
                System.out.println("名稱輸入錯誤");
        }
    }
    
    void deposit(int money){
        if(!hasName()){
            System.out.println("帳戶不存在");
            return;
        }
        System.out.printf("存款金額:%,d\n",money);
        if(money>0){
            balance+=money;
        }else{
            System.out.println("金額輸入錯誤");
        }
        print();
    }
    void withdraw(int money){
        if(!hasName()){
            System.out.println("帳戶不存在");
            return;
        }
        System.out.printf("提款金額:%,d\n",money);
        if(money>0){
            if(balance>=money)
                balance-=money;
            else
                System.out.println("餘額不足");
        }else{
            System.out.println("金額錯誤");
        }
        print();
    }
    void print() {
        if(!hasName()){
            System.out.println("帳戶不存在");
            return;
        }
        System.out.printf("%s 帳戶餘額: $%,d\n", name, balance);
    }
}
