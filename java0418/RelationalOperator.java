/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.java0418;

/**
 *
 * @author MB-study
 */
public class RelationalOperator {
    public static void main(String[] args) {
        int score=70;
        String pass=(score>=60)?"及格":"不及格";
        System.out.printf("score:%d %S\n",score,pass);
    }
}
