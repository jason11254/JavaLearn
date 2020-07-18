/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.game;

/**
 *
 * @author MB-study
 */
public class PlayGame {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(new Guess(number),"user");
        Thread t2 = new Thread(new Guess(number),"pc");
        t1.start();
        t2.start();
    }
}
