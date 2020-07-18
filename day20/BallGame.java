/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author MB-study
 */
public class BallGame implements Runnable {

    private int amount = 1000;
    //private int[] countarray = new int[30];
    private Map<String,Integer> map = new LinkedHashMap<>();
    
    public synchronized void get() {
        if(amount<=0) return;
        int tnum = (int) Thread.currentThread().getId();        
        String tname = Thread.currentThread().getName();
        //countarray[tnum]++;
        System.out.printf("%s 取到第 %d 顆球"+/*"總共%d顆"*/"\n", tname, amount/*, countarray[tnum]*/);
        amount--;
        map.put(tname, map.get(tname)+1);
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        map.put(tname, 0);
        while (amount > 0) {
            get(); //To change body of generated methods, choose Tools | Templates.
        }
        System.out.println(map);
    }
    
}
