package com.bobo.d3_polymorphic_convert;

public class Tortoise extends Animal {
    @Override
    public void run() {
        System.out.println("tortoise running");
    }

    public void shell() {
        System.out.println("tortoise shell");
    }
}
