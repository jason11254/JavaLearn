package com.lab.ocp.day10.food;

public class Mac implements FastFood{
    private String Name;
    private Integer price,count;
    
    @Override
    public Integer getCount() {
        return count;
    }

    @Override
    public void setCount(Integer count) {
        this.count=count;
    }

    @Override
    public void setName(String name) {
        this.Name=name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setPrice(Integer price) {
        this.price=price;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    public Mac() {
    }

    public Mac(String Name, Integer price, Integer count) {
        this.Name = Name;
        this.price = price;
        this.count = count;
    }

    
    
}
