/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day10.clothes;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToIntFunction;

/**
 *
 * @author MB-study
 */
public class ClothesBuy {
    public static void main(String[] args) {
        try {
            Clothes[] clothes;
            File file=new File("src\\main\\java\\com\\lab\\ocp\\day10\\clothes\\clothes.txt");
            String data = new Scanner(file,"UTF-8").useDelimiter("\\A").next();
            String[] rows = data.split("\n");
            clothes=new Clothes[rows.length-1];
            for(int i=1;i<rows.length;i++){
                String[] row=rows[i].split(",");
                String k=row[0];
                String s=row[1];
                Integer p=Integer.parseInt(row[2]);
                Integer a=Integer.parseInt(row[3]);
                if(k.equals("T-Shirt")){
                    clothes[i-1]=new Shirt(s,p,a);
                }else if(k.equals("Pants")){
                    clothes[i-1]=new Pant(s,p,a);
                }
            }
            ToIntFunction<Clothes> amountMultiPrice = c -> c.getAmount()*c.getPrice();
            //1.總成本
            int totalsum=Arrays.stream(clothes)
                                .peek(s->System.out.printf("品項:%s 尺寸:%s 價錢:%d 庫存:%d\n"
                                        ,s.getKind(),s.getSize(),s.getPrice(),s.getAmount()))
                                .mapToInt(amountMultiPrice)
                                .sum();            
            //個別成本
            int shirtsum=Arrays.stream(clothes)
                                .filter(s->s instanceof T_Shirt)
                                .mapToInt(amountMultiPrice)
                                .sum();
            int pantsum=Arrays.stream(clothes)
                                .filter(s->s instanceof Pants)
                                .mapToInt(amountMultiPrice)
                                .sum();
            System.out.printf("總庫存成本:%d 衣服成本:%d 褲子成本:%d\n",totalsum,shirtsum,pantsum);
            //T-Shirt M 3件 Pants S 2件 多少?
            int sum = Arrays.stream(clothes)
                            .filter(c->c instanceof T_Shirt)
                            .filter(s->s.getSize().equals("M"))
                            .findFirst().get().getPrice()*3
                     +Arrays.stream(clothes)
                            .filter(c->c instanceof Pants)
                            .filter(s->s.getSize().equals("S"))
                            .findFirst().get().getPrice()*2;
            System.out.println("3件 M號 T-Shirt + 2件 S號 Pants :"+sum);       
            
        } catch (Exception e) {
        }
    }
}
