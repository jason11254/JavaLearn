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
public class Borrow implements Runnable{
    private  BookStore bookStore;

    public Borrow(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++);
        while (bookStore.amount>0) {            
            bookStore.借書();
        }
    }
    
}
