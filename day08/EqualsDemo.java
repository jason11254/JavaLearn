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
public class EqualsDemo {
    public static void main(String[] args) {
        int x=100;
        int y=100;
        System.out.println(x==y);
        String a=new String("java");
        String b=new String("java");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        
        Pen p1=new Pen("Red",10);
        Pen p2=new Pen("blue", 10);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
