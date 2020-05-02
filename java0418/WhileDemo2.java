/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.java0418;

import java.util.Random;

/**
 *
 * @author MB-study
 */
public class WhileDemo2 {
    public static void main(String[] args) {
        int count=4;
        while(count>0){
            int n=new Random().nextInt(10);
            System.out.print(n+" ");
            count--;
        }
    }
}
