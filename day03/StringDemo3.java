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
public class StringDemo3 {
    public static void main(String[] args) {
        String s = "Java";
        s = add(s);
        System.out.println(s);
    }
    public static String add(String s) {
        //s = s + "8";
        s = s.concat("8");
        return s;
    }
}
