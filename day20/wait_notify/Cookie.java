/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.wait_notify;

/**
 *
 * @author MB-study
 */
public class Cookie {

    private boolean empty = true; //空盤子

    public synchronized void put(int num) throws InterruptedException {
        while (!empty) {
            wait();
        }
        System.out.printf("主人放第%d塊餅乾\n", num);
        empty = false;
        notifyAll();
    }

    public synchronized void eat(int num) throws InterruptedException {
        while (empty) {
            wait();
        }
        System.out.printf("小黃吃第%d塊餅乾\n", num);
        empty = true;
        notifyAll();
    }
}
