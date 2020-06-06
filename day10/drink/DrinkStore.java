/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day10.drink;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 *
 * @author MB-study
 */
public class DrinkStore {
    public static void main(String[] args) {
        Drink c1=new Coffee("拿鐵",50);
        Drink c2=new Coffee("美式",40);
        Drink c3=new Coffee("焦糖",60);
        
        Drink t1=new Tea("紅茶", 20);
        Drink t2=new Tea("綠茶", 20);
        
        Drink m1=new Milk("巧克力", 45);
        Drink m2=new Milk("鮮奶", 45);
        
        Drink j1=new Juice("柳橙", 40);
        Drink j2=new Juice("葡萄", 40);
    
        Drink[] drinks={c1,c2,c3,t1,t2,m1,m2,j1,j2};
        
        for(Drink drink:drinks)
            System.out.printf("品名:%s 價格:%d \n",drink.getName(),drink.getPrice());
        
        //只印出咖啡
        for(Drink drink:drinks)
            if(drink instanceof Coffee)
                System.out.printf("品名:%s 價格:%d \n",drink.getName(),drink.getPrice());
        
        //總共有多少飲品? 價格總和? 平均價格? 最貴? 最便宜?
        IntSummaryStatistics stat = Arrays.stream(drinks)
                            .mapToInt(s->s.getPrice())
                            .summaryStatistics();
        System.out.printf("飲品數量:%d 價格總和:%d 平均價格:%.1f 最貴:%d 最便宜:%d",
                stat.getCount(),stat.getSum(),stat.getAverage(),stat.getMax(),stat.getMin());
        System.out.println();
        //請問最貴的飲料名稱? 最便宜? 與平均同價?
        Arrays.stream(drinks)
                .filter(s->s.getPrice()== stat.getMax())
                .forEach(s->System.out.println("最貴品名:"+s.getName()+" 價格:"+s.getPrice()));
        Arrays.stream(drinks)
                .filter(s->s.getPrice()== stat.getMin())
                .forEach(s->System.out.println("最便宜品名:"+s.getName()+" 價格:"+s.getPrice()));
        Arrays.stream(drinks)
                .filter(s->s.getPrice()== stat.getAverage())
                .forEach(s->System.out.println("與平均價相同品名:"+s.getName()+" 價格:"+s.getPrice()));
    }
}
