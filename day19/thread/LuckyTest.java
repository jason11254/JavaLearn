/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day19.thread;

import java.util.Random;

/**
 *
 * @author MB-study
 */
class LuckyNumber extends Thread{

    public LuckyNumber() {
    }

    public LuckyNumber(String string) {
        super(string);
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        //code1
        int count = 0;
        while(true){
            int n=new Random().nextInt(1000);
            //code2
            ++count;
            if(n == 777){
                break;
            }
        }
        //輸出結果範例:小華取了261次得到777
        //code3
        System.out.printf("%s取了%d次得到777\n",tname,count);
    }
    
}
public class LuckyTest {
    //code4
    public static void main(String[] args) {
        new LuckyNumber("小華").start();
        new LuckyNumber("小明").start();
    }
}
