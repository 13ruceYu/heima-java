package com.bobo.d2_polymorphic_advantage;

public class Tortoise extends Animal {
    public String name = "tortoise";
    @Override
    public void run() {
        System.out.println("tortoise running");
    }
}
