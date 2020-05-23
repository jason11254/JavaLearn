/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day06;

/**
 *
 * @author MB-study
 */
public class Store {
    public static void main(String[] args) {
        Hamburger H=new Hamburger();
        H.setName("大麥克");
        H.setPrice(79);
        Hamburger H2=new Hamburger();
        H2.setName("麥香雞");
        H2.setPrice(49);
        System.out.printf("漢堡:%s 價錢:%d元\r\n",H.getName(),H.getPrice());  
        System.out.printf("漢堡:%s 價錢:%d元\r\n",H2.getName(),H2.getPrice());
        H.cook();
        H2.cook();
    }
}
