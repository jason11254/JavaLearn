/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author MB-study
 */
public class BallGameTeacher implements Runnable{
     private int amount = 100;
    private Map<String, Integer> map = Collections.synchronizedMap(new LinkedHashMap<>());
    //private Map<String, Integer> map = new Hashtable<>();
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        map.put(tname, 0);
        while (amount > 0) {            
            get();
        }
        System.out.println(map);
    }
    
    public synchronized void get() {
        if(amount <= 0) return;
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 取到第 %d 顆球\n", tname, amount);
        amount--;
        if(map != null)
            map.put(tname, map.get(tname) + 1);
    }
}
