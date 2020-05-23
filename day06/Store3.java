/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day06;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 *
 * @author MB-study
 */
public class Store3 {
    public static void main(String[] args) {
        Hamburger[] hamburgers={
            new Hamburger("麥香雞", 50),
            new Hamburger("大麥克", 79),
            new Hamburger("蕈菇雙牛", 129),
            new Hamburger("麥香魚", 50),
            new Hamburger("小漢堡",30),
            new Hamburger("吉士堡", 60)
        };
   
        int sum=Arrays.stream(hamburgers)
                .mapToInt(array->array.getPrice())
                .sum();
        System.out.println(sum);
        //統計
        IntSummaryStatistics stat=Arrays.stream(hamburgers)
                .mapToInt(h->h.getPrice())
                .summaryStatistics();
        System.out.println("總價"+stat.getSum());
        System.out.println("平均:"+stat.getAverage());
        System.out.println("最貴:"+stat.getMax());
        System.out.println("最便宜:"+stat.getMin());
        System.out.println("總個數:"+stat.getCount());
        
        int sum2=0;
        for(int i=0;i<hamburgers.length;i++){
            sum2+=hamburgers[i].getPrice();
        }
        System.out.println(sum2);
        
        int sum3=0;
        for (Hamburger hamburger : hamburgers) {
            sum3+=hamburger.getPrice();
        }
        System.out.println(sum3);
        
    }
}
