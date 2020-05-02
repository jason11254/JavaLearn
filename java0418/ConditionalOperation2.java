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
public class ConditionalOperation2 {
    public static void main(String[] args) {
        int x=10,y=0;
        String s=(++x>10&&y++>0)?"成功":"失敗";
        System.out.printf("x=%d y=%d %s\n",x,y,s);
        int x2=10,y2=0;
        String s2=(++x2>10||y2++>0)?"成功":"失敗";
        System.out.printf("x=%d y=%d %s\n",x2,y2,s2);
        System.out.println(5*3<20&3+7>9-1||20>=20-30&&false);
    }
}
