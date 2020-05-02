/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.java0418;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class GussingNumber {
    public static int max=100,min=0,ans,num;
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
       Scanner sc=new Scanner(System.in);
        int count=7;
        ans=new Random().nextInt(99)+1;
        do {                       
            System.out.printf("%d ~ %d 之間猜一整數(還有%d次機會): ",min,max,count);
            num=sc.nextInt();
            if(num>max || num<min){
                count--;
                System.out.println("請確實輸入範圍內整數");
                continue;                
            }
            if(num==ans||count==0){
                System.out.println("恭喜答對");
                break;
            }else{
                count--;
                if(num<ans)
                    min=num;
                else
                    max=num;
            }
            
        } while (true);
        switch(count){
            case 7:
                System.out.println("獎勵金額:1000NTD");break;
            case 6:
                System.out.println("獎勵金額:700NTD");break;
            case 5:
                System.out.println("獎勵金額:500NTD");break;
            case 4:
                System.out.println("獎勵金額:300NTD");break;
            case 3:
                System.out.println("獎勵金額:100NTD");break;
            case 2:
                System.out.println("獎勵金額:50NTD");break;
            case 1:
                System.out.println("獎勵金額:10NTD");break;
            case 0:
                System.out.println("菜");break;
        }
        System.out.println("輸入數字1.再菜一次 其他:結束遊戲");
        int round=sc.nextInt();
        if(round==1){
            menu();
        }else{
            System.out.println("結束遊戲");
        }         
    }
}
