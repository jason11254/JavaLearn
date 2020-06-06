/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day10.clothes;

/**
 *
 * @author MB-study
 */
public class Shirt extends T_Shirt{
    private String size;
    private Integer price,amount;

    public Shirt() {
    }

    public Shirt(String size, Integer price, Integer amount) {
        this.size = size;
        this.price = price;
        this.amount = amount;
    }
    
    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public Integer getAmount() {
        return amount;
    }
    
}
