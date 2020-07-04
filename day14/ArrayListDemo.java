/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        IntStream.rangeClosed(1, 10)
                .forEach(i -> list.add(new Random().nextInt(100)));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
        Comparator<Integer> comp = (o1, o2) -> o2-o1;
        Collections.sort(list, comp);
        System.out.println(list);
    }
}
