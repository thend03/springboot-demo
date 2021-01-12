package com.fc.springboot.springbootdemo.model;

/**
 * @author feng.chuang
 * @description goods model
 * @time 2020-12-31 16:33
 */
public class Goods {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
