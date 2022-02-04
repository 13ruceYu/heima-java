package com.bobo.demoThis;

public class Test {
    public static void main(String[] args) {
        Car c = new Car("Benz", 12.33);
        System.out.println(c.name);
        System.out.println(c.price);
        c.goWith("BMW");
    }
}
