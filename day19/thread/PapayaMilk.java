/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day19.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class BuyPapaya implements Callable<String>{

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "木瓜";
    }

}
class BuyMilk implements Callable<String>{

    @Override
    public String call() throws Exception {
        Thread.sleep(8000);
        return "牛奶";
    }

}

class BuyIce implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(5000);
        }catch(Exception e){}
        System.out.println("在run中印出買冰塊");
    }
    
}

public class PapayaMilk {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        BuyPapaya buyPapaya = new BuyPapaya();
        BuyMilk buyMilk = new BuyMilk();
        BuyIce buyIce = new BuyIce();
        FutureTask<String> task1 = new FutureTask<>(buyPapaya);
        FutureTask<String> task2 = new FutureTask<>(buyMilk);
        FutureTask<String> task3 = new FutureTask<>(buyIce,"少冰");
        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
        String data1 = task1.get();
        System.out.printf("買到%s \n",data1);
        String data2 = task2.get();
        System.out.printf("買到%s \n",data2);
        String data3 = task3.get();
        System.out.printf("我要%s \n",data3);
        System.out.printf("製作:%s \n",(data1+data2+data3));
    }
}
