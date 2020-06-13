/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import static java.util.stream.Collectors.toSet;

/**
 *
 * @author MB-study
 */
public class HashSetDemo4 {
    public static void main(String[] args) {
        Set hs=new HashSet();
        hs.add("國文");hs.add(100);
        hs.add("數學");hs.add(90);
        hs.add("英文");hs.add(100);
        hs.add(null);hs.add(3.14);
        Iterator it=hs.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if(!(next instanceof String)){
                it.remove();
            }
        }
        System.out.println(hs);
        //--------------------------
        hs=new HashSet();
        hs.add("國文");hs.add(100);
        hs.add("數學");hs.add(90);
        hs.add("英文");hs.add(100);
        hs.add(null);hs.add(3.14);
        
        Set hs2=(Set)hs.stream()
                .filter(s->s instanceof String)
                .collect(toSet());
        System.out.println(hs2);
    }
}
