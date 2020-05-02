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
public class ParkingSystem {
    public static int parking=0b100000;
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        System.out.println("1.查詢車位");
        System.out.println("2.我要停車");
        System.out.println("3.我要取車");
        System.out.println("4.離開系統");
        System.out.println("----------");
        System.out.print("請選擇==> ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int car,num;
        switch (x) {
            case 1://查詢車位
                System.out.println("目前車位:"+Integer.toBinaryString(parking));             
                break;
            case 2://我要停車
                System.out.println("請選擇車位(0~5): ");
                num=sc.nextInt();
                car = (int) Math.pow(2,num);
                if((parking & car) == 0){
                    System.out.printf("選擇成功! %d號車位可停車\n", num);
                    parking+=car;
                    System.out.println("停車完畢");
                }else
                    System.out.println("車位已有車 停車失敗");
                break;
            case 3://我要取車
                System.out.println("請選擇車位(0~5): ");
                num=sc.nextInt();
                car = (int) Math.pow(2,num);
                if((parking & car) != 0){
                    System.out.printf("選擇成功! %d號車位可取車\n", num);
                    parking-=car;
                    System.out.println("取車完畢");
                }else
                    System.out.println("車位無車 取車失敗");
                break;
            case 4:
                //離開系統
                break;
            default:
                break;
        }
        System.out.println("按任意按鍵繼續 ...");
        sc=new Scanner(System.in);
        if(sc.nextLine().equals("end")){
            System.out.println("關閉程式");
        }else
            menu();
    }
}
