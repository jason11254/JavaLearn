/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day19.thread;

/**
 *
 * @author MB-study
 */
class Race implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
        }
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 到達終點\n", tname);
    }

}

public class RaceDemo {

    public static void main(String[] args) {
        Race race = new Race();
        Thread t1 = new Thread(race, "兔子");
        Thread t2 = new Thread(race, "烏龜");
        t1.start();
        t2.start();
    }
}
