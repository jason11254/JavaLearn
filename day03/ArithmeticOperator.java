package com.lab.ocp.day03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MB-study
 */
import java.math.BigDecimal;

public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.1 == 0.2);
        System.out.println(0.1 + 0.1 + 0.1 == 0.3);
        System.out.println(0.1 + 0.1);
        System.out.println(0.1 + 0.1 + 0.1);
        
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = a.add(b).add(c);
        System.out.println(d.doubleValue());
        System.out.println(d.doubleValue() == 0.3);
    }
}
