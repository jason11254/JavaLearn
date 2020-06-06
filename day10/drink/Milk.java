/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day10.drink;

/**
 *
 * @author MB-study
 */
public class Milk implements Drink{
    private String name;
    private Integer price;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price=price;
    }

    public Milk() {
    }

    public Milk(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    
}
