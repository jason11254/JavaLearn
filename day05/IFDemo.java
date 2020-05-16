/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

import java.util.Random;

/**
 *
 * @author MB-study
 */
public class IFDemo {
    public static void main(String[] args) {
        int x=new Random().nextInt();
        if(isodd(x))
            System.out.println(x+" 是偶數");
        else
            System.out.println(x+" 是奇數");
    }
    public static boolean isodd(int x) {
        return x%2==0?true:false;
    }
}
