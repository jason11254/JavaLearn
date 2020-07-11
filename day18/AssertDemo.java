/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day18;

/**
 *
 * @author MB-study
 */
public class AssertDemo {
    public static void main(String[] args) {
        int score = -30; //0~100
        assert score >= 0 && score <=0 : "分數錯誤";
        System.out.println("分數:"+score);
    }
}
