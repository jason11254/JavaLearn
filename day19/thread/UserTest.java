/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day19.thread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB-study
 */
class Egg extends Thread {

    int[] e = new int[10];

    @Override
    public void run() {
        for (int i = 0; i < e.length; i++) {
            try {
                Thread.sleep(new Random().nextInt(5000));
                int value = e[i] = new Random().nextInt(100) + 1;
                System.out.printf("e[%d] = %d\n", i, value);
            } catch (Exception e) {

            }
        }
    }

}

class Bread extends Thread {

    int[] b = new int[10];

    @Override
    public void run() {
        for (int i = 0; i < b.length; i++) {
            try {
                Thread.sleep(new Random().nextInt(5000));
                int value = b[i] = new Random().nextInt(100) + 1;
                System.out.printf("b[%d] = %d\n", i, value);
            } catch (Exception e) {

            }
        }
    }
}

class User extends Thread {

    int[] u = new int[10];
    Egg egg;
    Bread bread;

    public User(Egg e, Bread b) {
        egg = e;
        bread = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < u.length;) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
            if (egg.e[i] != 0 && bread.b[i] != 0) {
                u[i] = egg.e[i] + bread.b[i];
                System.out.printf("\te[%d]+b[%d]=%d\n", i, i, u[i]);
                i++;
            } else {
                continue;
            }
        }
    }

}

public class UserTest {

    public static void main(String[] args) throws InterruptedException {
        Egg e = new Egg();
        Bread b = new Bread();
        e.start();
        b.start();
        //Thread.sleep(50000);
        new User(e, b).start();
    }
}
