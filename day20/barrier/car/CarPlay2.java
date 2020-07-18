/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.barrier.car;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author MB-study
 */
public class CarPlay2 {
    public static void main(String[] args) {
        int parties = 3;
        int amount = 6;
        CyclicBarrier cb = new CyclicBarrier(parties);
        for(int i=1;i<=amount;i++) {
            Car car = new Car(cb);
            car.start();
        }
    }
}
