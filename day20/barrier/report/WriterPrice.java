/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.barrier.report;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author MB-study
 */
public class WriterPrice extends Thread{
private CyclicBarrier cb;
    private Report report;

    public WriterPrice(CyclicBarrier cb, Report report) {
        this.cb = cb;
        this.report = report;
    }
       
    @Override
    public void run() {
        try {
            System.out.println("Price 工作中...");
            Thread.sleep(new Random().nextInt(5000));
            report.setPrice(3000);
            cb.await();
        } catch (Exception e) {
        }
    }
    
}
