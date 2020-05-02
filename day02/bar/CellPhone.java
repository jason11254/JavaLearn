/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day02.bar;

/**
 *
 * @author MB-study
 */
public class CellPhone {
    public void job(){
        System.out.println("打電話+Game");
        Phone p=new Phone();
        p.job();
    }
    public void price(){
        System.out.println("$10_0000");
    }
}
