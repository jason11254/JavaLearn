/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day11;

/**
 *
 * @author MB-study
 */
public class CalcDemo {
    public static void main(String[] args) {
        Calc add=new Calc() {
            @Override
            public double cal(double x, double y) {
                return x+y;
            }
        };
        
        Calc sub=new Calc() {
            @Override
            public double cal(double x, double y) {
                return x-y;
            }
        };
        
        Calc mul = (double x, double y) -> {return x*y;};
        
        Calc div = (x, y) -> x/y ;
        
        Calc Max = (x,y)->Math.max(x, y);
        
        Calc Max2 = Math::max;
        
        System.out.println(add.cal(10, 20));
        System.out.println(sub.cal(10, 20));
        System.out.println(mul.cal(10, 20));
        System.out.println(div.cal(10, 20));
        System.out.println(Max.cal(10, 20));
        System.out.println(Max2.cal(10, 20));
    }
}
