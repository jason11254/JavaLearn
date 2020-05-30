/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day09;

/**
 *
 * @author MB-study
 */
enum Sex{
    man,female;
    private Sex(){System.out.println("呼叫Sex建構子");}
}
public class EnumDemo {
    public static void main(String[] args) {
        checkSex(Sex.man);
    }
    public static void checkSex(Sex sex) {
        switch(sex){
            case man:
                System.out.println("男生");
                break;
            case female:
                System.out.println("女生");
                break;
        }
    }
}
