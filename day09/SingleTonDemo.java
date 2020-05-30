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
public class SingleTonDemo {
    public static void main(String[] args) {
        SingleDB db=SingleDB.getInstance();
        System.out.println(db.getData());
    }
}
