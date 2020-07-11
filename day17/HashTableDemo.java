/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day17;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author MB-study
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> map = new Hashtable<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        System.out.println(map);
        Enumeration<Integer> e = map.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
