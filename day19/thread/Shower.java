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
class Father extends Thread{

    @Override
    public void run() {
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯");
        System.out.println("爸爸打電話請工人送瓦斯");
        Worker worker = new Worker();
        worker.start();
        try {
            //worker.join(6000);
            worker.join();
        } catch (InterruptedException ex) {            
        }
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
  
}

class Worker extends Thread{

    @Override
    public void run() {
        System.out.println("接到電話,接受訂單");
        System.out.println("開始送瓦斯");
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
                System.out.printf("%d秒經過\n",i);
            } catch (Exception e) {
                System.out.println("發生意外:"+e);
                return;
            }
        }
        System.out.println("瓦斯送到了");
    }
    
}

public class Shower {
    public static void main(String[] args) {
        Father f1 = new Father();
        f1.start();
    }
}
