/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class VarargDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(add(10,20));
        System.out.println(add(arr));
    }
    public static int add(int x,int y){
        return x+y;
    }
    //支援陣列或是複數資料
    public static int add(int... nums){
        return Arrays.stream(nums).sum();
    }
}
