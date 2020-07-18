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
public class CarPlay {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3);
        for(int i=1;i<=3;i++) {
            Car car = new Car(cb);
            car.start();
        }
    }
}
