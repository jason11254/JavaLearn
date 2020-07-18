/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.book;

/**
 *
 * @author MB-study
 */
public class BookStore {

    public static int amount = 100;

    public void 借書() {
        String tname = Thread.currentThread().getName();
        for (int i = 0; i < Integer.MAX_VALUE; i++);        
        synchronized (BookStore.class) {
            if(amount<=0) return;
            System.out.printf("%s借了第%d本書\n", tname, amount);
            amount--;
        }
    }
}
