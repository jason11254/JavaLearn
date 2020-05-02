/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day01;

/**
 *
 * @author MB-study
 */
public class Circle {
    static String name;
    int r;
    double area;
    void print(){
        area=Math.pow(r, 2)*Math.PI;
        System.out.println(name);
        System.out.println(r);
        System.out.println(area);
    }
}
