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
public class SingleDB {
    private String data="一百萬筆資料...";
    private static SingleDB instance = new SingleDB();

    public SingleDB() {
    }
    public static SingleDB getInstance(){
        return instance;
    }
    
    public String getData() {
        return data;
    }
    
}
