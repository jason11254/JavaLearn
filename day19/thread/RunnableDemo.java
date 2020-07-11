/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day19.thread;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author MB-study
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r1 = ()->{System.out.println(new Date());};
        Runnable r2 = ()->{System.out.println(new Random().nextInt(100));};
        Thread t1 = new Thread(r1,"t1");
        Thread t2 = new Thread(r2,"t2");
        t1.start();
        t2.start();
        
    }
}
