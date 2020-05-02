/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day02;

/**
 *
 * @author MB-study
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] lens={100,90,80};
        int[] wids={30,20,10};
        int i;
        for(i=0;i<lens.length;i++)
            System.out.println(lens[i]);
        System.out.println("--------------------------");
        for(i=0;i<wids.length;i++)
            System.out.println(lens[i]);
        System.out.println("--------------------------");
        for(i=0; i<lens.length;i++){
            int area=lens[i]*wids[i];
            System.out.println(area);
        }
    }
}
