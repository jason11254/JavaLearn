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
public class WhileDemo {
    public static void main(String[] args) {
        while(true){
            int n=new Random().nextInt(100);
            if(n!=0 && n%3!=0){
                continue;
            }else{    
                System.out.println(n);
            }
            if(n==0)
                break;
        }
    }
}
