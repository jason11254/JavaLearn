/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day03;

/**
 *
 * @author MB-study
 */
public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int[][] nums = new int[2][5];
        System.out.println(nums[1][3]);
        nums[0] = new int[3];
        nums[1] = new int[1];
        nums[1][0] = 10;
        System.out.println(nums[1][3]); // 超出陣列最大維度範圍
    }
}
