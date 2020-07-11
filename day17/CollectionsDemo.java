/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MB-study
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        List.add(3);List.add(1);List.add(4);
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);
        Collections.sort(List,(n1,n2)->n2-n1);
        System.out.println(List);
        System.out.println(Collections.min(List));
        System.out.println(Collections.max(List));
        Collections.shuffle(List);
        System.out.println(List);
        Collections.reverse(List);
        System.out.println(List);
    }
}
