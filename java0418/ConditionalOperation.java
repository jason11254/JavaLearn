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
public class ConditionalOperation {
    public static void main(String[] args) {
        double bmi=21.2;
        String result=(bmi>18 && bmi<=23)?"正常":"不正常";
        System.out.printf("bmi=%.1f %s\n", bmi,result);
    }
}
