/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day06;

/**
 *
 * @author MB-study
 */
public class Hamburger {
    private String name;//物件屬性
    private int price;
    //建構子
    public Hamburger() {
    }
    public Hamburger(String name, int price) {
        this.name = name;
        this.price = price;
    }
    //封裝屬性
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString(){
        String data=String.format("漢堡:%s 價格:%d\r",name,price);
        return data;
    }
    public void cook(){
        System.out.println("=================");
        System.out.println(name+"的做法");
        String food="";
        switch(name){
            case "大麥克":food="牛肉";break;
            case "麥香雞":food="雞肉";break;
            default:food="食材";break;
        }
        System.out.println("-----------------");
        System.out.println("1.放麵包");
        System.out.println("2.放"+food);
        System.out.println("3.放醬料");
        System.out.println("4.包裝");
        System.out.println("=================");
    }
}
