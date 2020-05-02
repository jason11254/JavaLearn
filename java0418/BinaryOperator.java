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
public class BinaryOperator {
    public static void main(String[] args) {
        int x=5&3;
        int y=5|3;
        int z=5^3;
        System.out.println(x+" "+y+" "+z);
        int parking=0b110101;
        int no=3;
        int car=(int)Math.pow(2, no);//0b001000
        int check=parking & car;
        System.out.print(no+"號車位");
        System.out.println(check==0?"可停":"不可停");
    }
}
