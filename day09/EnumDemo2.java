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
enum TWCurrency{
    一元(1),五元(5),拾元(10),一百元(100),兩百元(200),伍佰元(500),一千元(1000),兩千元(2000);
    int value;

    private TWCurrency(int value) {
        this.value = value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
}
public class EnumDemo2 {
    public static void main(String[] args) {
        TWCurrency twc1=TWCurrency.兩百元;
        System.out.println(twc1.getValue());
    }
}
