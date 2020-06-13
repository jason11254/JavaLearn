/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author MB-study
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //hashset有自己的排序
        Set hs=new HashSet();
        hs.add("國文");        
        hs.add("數學");
        hs.add("英文");
        System.out.println(hs);
        //按照進入順序排序
        hs = new LinkedHashSet();
        hs.add("國文");        
        hs.add("數學");
        hs.add("英文");
        System.out.println(hs);
        
    }
}
