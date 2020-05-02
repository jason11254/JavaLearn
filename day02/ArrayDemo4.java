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
public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores={40,70,30,90,100};
        int sum=0,count=0;
        for(int i=0;i<scores.length;i++){
            if(scores[i]>=60){
                count++;
                sum+=scores[i];
            }
        }
        System.out.printf("%.1f\n",(double)sum/count);
        
        double avg=Arrays.stream(scores).filter(s->s>=60).average().getAsDouble();
        System.out.printf("%.1f\n",avg);
    }
}
