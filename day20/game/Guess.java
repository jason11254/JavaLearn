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
public class Guess implements Runnable {

    private Number number;

    public Guess(Number number) {
        this.number = number;
    }

   
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        try {
            while (!Number.gameover) {
                if (tname.equals("pc")) { // PC
                    number.pcGuess();
                } else { // User
                    number.userGuess();
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }

    }

}
