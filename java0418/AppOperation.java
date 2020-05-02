/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.java0418;

/**
 *
 * @author MB-study
 */
public class AppOperation {
    public static void main(String[] args) {
        int age=10,age2=10;
        int var=age++,var2=++age2;
        System.out.printf("age++:age=%d var=%d\n++age:age=%d var=%d\n",age,var,age2,var2);
    }
}
