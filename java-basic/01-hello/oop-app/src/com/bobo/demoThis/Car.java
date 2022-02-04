package com.bobo.demoThis;

public class Car {
    String name;
    double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void goWith(String name) {
        System.out.println(name + " compete with " + this.name);
    }
}
