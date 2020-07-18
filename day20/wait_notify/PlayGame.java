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
public class PlayGame {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        Thread t1 = new Thread(new Put(cookie),"主人");
        Thread t2 = new Thread(new Eat(cookie),"小黃");
        t1.start();
        t2.start();
    }
}
