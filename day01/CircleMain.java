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
public class CircleMain {
    public static void main(String[] args) {
        Circle.name="圓形";
        Circle c=new Circle();
        c.r=6;
        c.print();
        Circle c2=new Circle();
        c2.r=7;
        c2.print();
    }
}
