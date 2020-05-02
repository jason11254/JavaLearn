/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.java0418;

import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class BinaryOperatorParking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=1;
        int parking=0b110101; 
        while(x==1){
            System.out.println("輸入0停車,輸入1牽車,輸入2離開");
            int move=sc.nextInt();                     
            if(move==0){           
                System.out.println("現在車位狀況:"+Integer.toBinaryString(parking));
                System.out.println("輸入想停的車位0~5");
                int no=sc.nextInt();
                int car=(int)Math.pow(2, no);
                if((parking&car)==0){
                    System.out.println(no+"號車位可停");
                    parking+=car;
                    System.out.println("現在車位狀況:"+Integer.toBinaryString(parking));
                }else
                    System.out.println(no+"號車位不可停");
            }else if(move==1){        
                System.out.println("現在車位狀況:"+Integer.toBinaryString(parking));
                System.out.println("輸入想離開的車位0~5");
                int no=sc.nextInt();
                int car=(int)Math.pow(2, no);
                if((parking&car)!=0){
                    System.out.println(no+"號車位可離開");
                    parking-=car;
                    System.out.println("現在車位狀況:"+Integer.toBinaryString(parking));
                }else
                    System.out.println(no+"號車位沒有車");
            }else if(move==2)
                x=2;
        }
        System.out.println("離開");
    }
}
