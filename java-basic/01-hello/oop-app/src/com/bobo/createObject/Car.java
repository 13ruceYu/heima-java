package com.bobo.createObject;

public class Car {
    String name;
    double price;

    public void start() {
        System.out.println(name + "的价格是：" + price + ", start");
    }

    public void run() {
        System.out.println(name + "'s price is " + price + ", run");
    }
}
