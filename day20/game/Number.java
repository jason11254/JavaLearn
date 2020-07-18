/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class Number {
     public static boolean gameover = false;
    private int ans =new Random().nextInt(100);
    private boolean isUser = true; // User 先猜
    public int min = 0;
    public int max = 100;
    
    public synchronized void userGuess() throws Exception {
        if(gameover) return;
        while(!isUser) {
            wait();           
        }
        System.out.printf("User 需在 %d ~ %d 之間猜一數字: \n", min, max);
        //int num = new Random().nextInt(max - min - 1) + min + 1;
        int num = new Scanner(System.in).nextInt();
        System.out.printf("User 猜: %d\n", num);
        if(num == ans) {
            System.out.println("User 答對了");
            gameover = true;
        } else if(num > ans & num<max) {
            max = num;
        } else if(num < ans & num>min){
            min = num;
        } else if(num > max){
            System.out.printf("請輸入小於%d的數\n",max);
            userGuess();
        } else if(num < min){
            System.out.printf("請輸入大於%d的數\n",min);
            userGuess();
        }
        isUser = false;
        notifyAll();
    }
    
    public synchronized void pcGuess() throws Exception {
        
        while(isUser) {
            wait();
        }
        if(gameover) return;
        System.out.printf("PC 需在 %d ~ %d 之間猜一數字: \n", min, max);
        int num = new Random().nextInt(max - min - 1) + min + 1;
        System.out.printf("PC 猜: %d\n", num);
        if(num == ans) {
            System.out.println("PC 答對了");
            gameover = true;
        } else if(num > ans) {
            max = num;
        } else {
            min = num;
        }
        isUser = true;
        notifyAll();
    }
    
}
