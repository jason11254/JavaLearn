/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day10.food;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class FoodStore {
    public static void main(String[] args) {
        Food f1=new BigMac("大麥克", 70, 10);
        Food f2=new FishMac("麥香魚", 50, 15);
        Food[] foods={f1,f2};
        Arrays.stream(foods)
                .peek(s->System.out.printf("品名:%s 價格:%d \n",s.getName(),s.getPrice()))
                .count();
        //兩個漢堡都賣掉光時,結帳價格為?
        int sum=Arrays.stream(foods)
                        .map(s->(FastFood)s)
                        .mapToInt(s->s.getPrice()*s.getCount())
                        .sum();
        System.out.println("結帳價格:"+sum);
    }
}
