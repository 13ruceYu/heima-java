package com.bobo.constructor;

public class Car {
    String name;
    double price;

    public Car() {
        System.out.println("无参构造器触发了");
    }

    public Car(String n, double p) {
        name = n;
        price = p;
        System.out.println("有参构造器触发了");
    }

}
