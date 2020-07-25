/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day22.schedule;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author MB-study
 */
public class SingleScheduleDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable = ()-> new Random().nextInt(100);
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        System.out.println("等5秒後進行");
        ScheduledFuture<Integer> future = service.schedule(callable, 5, TimeUnit.SECONDS);
        System.out.println(future.get());
        service.shutdown();
        System.out.println("service關閉");
    }
}
