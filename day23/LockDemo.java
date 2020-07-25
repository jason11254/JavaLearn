/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day23;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class LockDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Lotto("王五"));
        service.execute(new Lotto("李四"));
        service.execute(new Lotto("張三"));
        service.shutdown();
    }
}
class Lotto implements Runnable{
    String name;

    public Lotto(String name) {
        this.name = name;
    }
    
    static ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            IntStream.rangeClosed(1, 5).
                    forEach((i)->System.out.printf("%s %d -> %d\n",name,i,new Random().nextInt(100)));
        } catch (Exception e) {
        } finally{
            lock.unlock();
        }
    }
    
}