/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day02;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] radius={10,20,30};
        int i;
        for(i=0;i<radius.length;i++){
            double area=Math.pow(radius[i], 2)*Math.PI;
            System.out.printf("%.2f\n",area);
        }
        
        for(int r:radius){
            double area=Math.pow(r, 2)*Math.PI;
            System.out.printf("%.2f\n",area);
        }
        Arrays.stream(radius).forEach(r->{
            double area=Math.pow(r, 2)*Math.PI;
            System.out.printf("%.2f\n",area);
        });
        Arrays.stream(radius).forEach(r->System.out.printf("%.2f\n",Math.pow(r, 2)*Math.PI));
    }
}
