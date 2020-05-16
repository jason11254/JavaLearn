/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

/**
 *
 * @author MB-study
 */
public class IFDemo3 {
    static int x=70;
    public static void main(String[] args) {        
        if(add(x))
            System.out.println(x);
    }
    public static boolean add(int x) {
        if(x>=50){
            IFDemo3.x=x+1;
            return true;
        }
        return false;
    }
}
