/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MB-study
 */
public class HashSetDemo3 {
    public static void main(String[] args) {
        Set hs=new HashSet();
        hs.add("國文");hs.add(100);
        hs.add("數學");hs.add(90);
        hs.add("英文");hs.add(100);
        hs.add(null);hs.add(3.14);
        //求出整數資料相加結果
        //java 7 
        int sum=0;
        for(Object obj:hs){
            if(obj instanceof Integer){
                sum+=(Integer)obj;
            }
        }
        System.out.println("java7 sum="+sum);
        //java 8 stream
        sum = hs.stream().filter(s ->s instanceof Integer)
                   .mapToInt(s -> Integer.parseInt(s.toString()))
                   .sum();
        System.out.println("javs8 sum="+sum);
    }
}
