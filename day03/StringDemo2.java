/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day03;

/**
 *
 * @author MB-study
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println("在 main 方法的 s=" + s);
        add(s);
        System.out.println("在 main 方法的 s=" + s);
    }
    
    public static void add(String s) {
        System.out.println("在 add 方法的 s=" + s);
        s = s + "8";
        System.out.println("在 add 方法的 s=" + s);
    }
}
