/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20;

/**
 *
 * @author MB-study
 */
public class BallGamePlay {
    public static void main(String[] args) {
        //資源
        BallGame bg1 = new BallGame();
        Thread t1 = new Thread(bg1,"Meary");
        Thread t2 = new Thread(bg1,"John");
        t1.start();
        t2.start();
    }
}
