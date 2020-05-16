package com.lab.ocp.day03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MB-study
 */
public class MultiArrayDemo {
    public static void main(String[] args) {
        int[][] nums = new int[2][3];
        nums[0][0] = 100;
        nums[0][1] = 90;
        nums[0][2] = 80;
        nums[1][0] = 70;
        nums[1][1] = 60;
        nums[1][2] = 50;
        System.out.println(nums.length);
        System.out.println(nums);
        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
            for(int k=0;k<nums[i].length;k++) {
                System.out.print(nums[i][k] + "\t");
            }
            System.out.println();
        }
        
    }
}
