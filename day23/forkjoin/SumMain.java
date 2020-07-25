/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day23.forkjoin;

import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author MB-study
 */
public class SumMain {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        ForkJoinPool fjp = new ForkJoinPool();
        Sum s = new Sum(0, data.length, data);
        fjp.invoke(s);
    }
}
