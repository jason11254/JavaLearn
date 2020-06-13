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
public class HashSetDemo2 {
    public static void main(String[] args) {
        Set hs=new HashSet();
        hs.add("國文");hs.add(100);
        hs.add("數學");hs.add(90);
        hs.add("英文");hs.add(100);
        hs.add(null);hs.add(3.14);
        System.out.println(hs);
        //印出每一筆資料 java7 for loop
        for(Object obj : hs){
            System.out.println(obj);
        }
        //java 8 forEach
        hs.forEach(System.out::println);
        
    }
}
