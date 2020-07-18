/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 *
 * @author MB-study
 */
class LuckyNumber implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.printf("%s執行中...",Thread.currentThread().getName());
        int n = new Random().nextInt(100);
        return n;
    }
    
}
public class CallableDemo {
    public static void main(String[] args) throws Exception {
        List<FutureTask> list = new ArrayList();
        for(int i=0;i<10;i++) {
            FutureTask<Integer> task = new FutureTask<>(new LuckyNumber());
            list.add(task);
            new Thread(task).start();
            System.out.println(task.get());
        }   
    }
}
