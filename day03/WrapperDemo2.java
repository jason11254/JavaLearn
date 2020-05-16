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
public class WrapperDemo2 {
    public static void main(String[] args) {
        int a = 100;
        a = 200;
        //Integer b = Integer.valueOf("100"); // Java 5 之前
        Integer b = 100; // Java 5 (含)之後, auto-boxing 自動裝箱
        b = 200;
        System.out.println(a); // int
        System.out.println(b); // Integer
        System.out.println(a + b.intValue()); // Java 5 之前
        System.out.println(a + b); // Java 5 (含)之後, auto-unboxing 自動拆箱
    }
}
