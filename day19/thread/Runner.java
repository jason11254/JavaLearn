/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day19.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB-study
 */
//繼承執行緒
//實作run方法
public class Runner extends Thread{
    public void job(){
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++){
            System.out.printf("%s 跑了 %d 步\n",tname,i);
        }
    }

    public Runner() {
    }

    public Runner(String tname) {
        super(tname);
    }

    public void job2() throws InterruptedException{
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++){
            System.out.printf("%s 跑了 %d 步\n",tname,i);
            if(tname.equals("兔子")&&i==500){
                System.out.println("兔子熟睡中...");
                Thread.sleep(5000);
            }
        }
    }
    @Override
    public void run() {
        try {
            job2();
        } catch (InterruptedException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
