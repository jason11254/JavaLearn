/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.java0418;

import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入身高:");
        double h=sc.nextDouble();
        System.out.println("請輸入體重:");
        double w=sc.nextDouble();
        double bmi=w/Math.pow(h/100, 2);
        System.out.printf("身高:%.1f 體重:%.1f BMI:%.1f\r\n",h,w,bmi);
    }
}
