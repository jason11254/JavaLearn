/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08;

/**
 *
 * @author MB-study
 */
public class MathCalcDemo {
    public static void main(String[] args) {
        System.out.println(calc(1, 2));
        System.out.println(calc(1.0, 2.0));
    }
    
    public static int calc(int x,int y){
        return x + y;
    } 
    
    public static double calc(double x,double y){
        return x * y;
    }
    
    public static double calc(double x,float y){
        return x / y;
    }
    
    public static float calc(int x,float y){
        return x - y;
    }
    
}
