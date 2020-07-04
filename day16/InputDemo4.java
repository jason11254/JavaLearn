/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class InputDemo4 {

    public static void main(String[] args) {
        try {
            input();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    private static void input() {
        int[] y = {2, 5, 0};
        System.out.print("請輸入分子: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.print("請選擇分母的陣列維度(0:2,1:5,2:0): ");
        int idx = sc.nextInt();
        int result = x / y[idx];
        System.out.printf("%d / %d = %d\n", x, y[idx], result);

        System.out.println("finish");

    }
}
