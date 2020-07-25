/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day22.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author MB-study
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        //ExecutorService service = Executors.newFixedThreadPool(3);
        //ExecutorService service = Executors.newSingleThreadPool();
        System.out.println("Pool開啟");
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new LongTask());
        service.submit(new Task());
        System.out.printf("執行緒數量:%d\n",Thread.activeCount());
        service.shutdown();
        System.out.println("Pool宣告關閉");
        
        //監聽pool狀態
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("pool仍在執行中未關閉");
            
        }
        System.out.println("POOL真正關閉");
    }
}
