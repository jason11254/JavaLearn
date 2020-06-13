/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author MB-study
 */
public class HashSetDemo5 {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("國文");
        hs.add("數學");
        hs.add("英文");
        System.out.println(hs);
        System.out.println(hs.size());
        Iterator<String> it=hs.iterator();
        //...
        for (Iterator<String> iterator = hs.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
        }
        
    }
    
}
