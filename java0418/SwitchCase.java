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
public class SwitchCase {
    public static void main(String[] args) {
        //String name="Employee";
        //String name="Manager";
        String name="Boss";
        int salary=0;
        switch(name){
            case "Boss":
                salary+=40000;
            case "Manager":
                salary+=20000;
            case "Employee":
                salary+=30000;
                break;            
        }
        System.out.println("薪資:"+salary);
    }
}
