/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day22.invoke;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author MB-study
 */
public class InvokeAllDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> list = new ArrayList<>();
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        list.add(()->new Random().nextInt(9)+1);
        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<Integer>> futures = service.invokeAll(list);
        for (Future<Integer> future:futures) {
            System.out.println(future.get());
        }
        service.shutdown();
    }
}
