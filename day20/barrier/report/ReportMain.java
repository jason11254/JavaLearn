/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.barrier.report;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author MB-study
 */
public class ReportMain {
    public static void main(String[] args) {
        int parties = 3;
        Report report = new Report();
        CyclicBarrier cb = new CyclicBarrier(parties, ()->{
            System.out.println(report);
        });
        new WriterAuthor(cb, report).start();
        new WriterContent(cb, report).start();
        new WriterPrice(cb, report).start();
        
    }
}
