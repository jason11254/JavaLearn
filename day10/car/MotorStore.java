/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day10.car;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class MotorStore {
    public static void main(String[] args) {
        Motor b1=new BMW();
        Motor b2=new BMW();
        Motor b3=new Banz();
        Motor b4=new Banz();
        Motor b5=new Motorcycle();
        Motor b6=new Motorcycle();
        Motor b7=new Motorcycle();
        Motor[] motors={b1,b2,b3,b4,b5,b6,b7};
        //求汽車/摩托車總價
        int carsum=Arrays.stream(motors)
                            .filter(s->s instanceof Car)
                            .mapToInt(s->s.getPrice())
                            .sum();
        int motsum=Arrays.stream(motors)
                            .filter(s->s instanceof Motorcycle)
                            .mapToInt(s->s.getPrice())
                            .sum();
        System.out.printf("汽車總價:$%,d 摩托車總價$%,d\n",carsum,motsum);
    }   
}
