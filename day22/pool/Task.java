/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day22.pool;

import java.util.Random;

/**
 *
 * @author MB-study
 */
public class Task implements Runnable{

    @Override
    public void run() {
        int n = new Random().nextInt(10);
        System.out.printf("短任務(得到0~9的值): %d \n",n);
    }
    
}
