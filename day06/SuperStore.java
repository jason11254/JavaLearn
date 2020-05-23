/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day06;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 *
 * @author MB-study
 */
public class SuperStore {
    public static void main(String[] args) {
        //單品
        Hamburger h1=new Hamburger("大麥克",80);
        Hamburger h2=new Hamburger("麥香魚", 50);
        SideDish s1=new SideDish("薯條", 30);
        SideDish s2=new SideDish("沙拉", 40);
        Drink d1=new Drink("可樂", 25);
        Drink d2=new Drink("咖啡",45);
        Drink d3=new Drink("紅茶",30);
        
        //套餐
        FastFood f=new FastFood("一號餐");
        f.setHamburger(h2);
        f.setSideDish(s2);
        f.setDrink(d3);
        System.out.println(f);
        System.out.println("$"+f.getPrice());
        
        FastFood f2=new FastFood("二號餐",h1,s1,d2);
        System.out.println(f2);
        System.out.println("$"+f2.getPrice());
        
        //組合套餐
        FastFood[] ffs={f,f2,f,f,f2};
        //總價=?
        IntSummaryStatistics stat=Arrays.stream(ffs)
                .mapToInt(ff->ff.getPrice())
                .summaryStatistics();
        System.out.println("總價"+stat.getSum());
        //飲料$佔幾%?
        int drintSum=Arrays.stream(ffs)
                .mapToInt(ff->ff.drinkPrice())
                .sum();
        System.out.println("飲料錢="+drintSum);
        System.out.printf("飲料錢佔比=%.2f%%\r\n",(double)drintSum/stat.getSum()*100);
        
    }
}
