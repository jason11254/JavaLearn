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
public class RunnerTest {
    public static void main(String[] args) {
        //單一執行緒
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        r1.job();
        r2.job();
    }
}
