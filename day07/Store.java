/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

/**
 *
 * @author MB-study
 */
public class Store {
    public static void main(String[] args) {
        Food[] foods={
            new Drink("可樂", 25),
            new Hamburger("大麥克", 80),
            new Hamburger("麥香魚", 40),
            new SideDish("玉米濃湯", 55),
            new SideDish("薯條", 40)
        };
        System.out.println(foods[0]);
        Food food1=new Hamburger("麥香雞", 40);
        Food food2=new SideDish("蘋果派", 55);
        Food food3=new Drink("紅茶", 30);
        System.out.println(food1);
    }
}
