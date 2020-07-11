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
public class RunnerTest2 {
    public static void main(String[] args) {
        //多執行緒
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        r1.setName("烏龜");
        r2.setName("兔子");
        r1.start();//下達start會自動執行run
        r2.start();
        //以建構子取名
        Runner r3 = new Runner("小烏龜");
        r3.start();//下達start會自動執行run
    }
}
