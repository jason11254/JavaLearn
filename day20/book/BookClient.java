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
public class BookClient {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Thread t1 = new Thread(new Borrow(bookStore),"小明");
        Thread t2 = new Thread(new Borrow(bookStore),"小華");
        t1.start();
        t2.start();
    }
}
