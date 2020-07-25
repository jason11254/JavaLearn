/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day22.schedule;

import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class User {
    static int guess = 0;
    public static void main(String[] args) {
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.println("請下注(1~9):");
            guess=sc.nextInt();
            //等待兌換
            while (guess !=0) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }               
            }
        } while (true);
    }
}
