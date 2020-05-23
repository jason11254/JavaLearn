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
public class FastFood {
    private String name;
    private Hamburger hamburger;
    private SideDish sideDish;
    private Drink drink;

    public FastFood(String name) {
        this.name = name;
    }

    public FastFood(String name, Hamburger hamburger, SideDish sideDish, Drink drink) {
        this.name = name;
        this.hamburger = hamburger;
        this.sideDish = sideDish;
        this.drink = drink;
    }
    

    public String getName() {
        return name;
    }
    //業務方法
    public int getPrice(){
        int price=hamburger.getPrice()+sideDish.getPrice()+drink.getPrice();
        //price=(int)(price*0.9);//打九折
        return price;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    
    @Override
    public String toString() {
        return "FastFood{" + "name=" + name + ", hamburger=" + hamburger + ", sideDish=" + sideDish + ", drink=" + drink + '}';
    }
    public int drinkPrice(){
        return drink.getPrice();
    }
    
}
