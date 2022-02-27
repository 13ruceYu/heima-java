package com.bobo.d1_polymorphic;

public class Tortoise extends Animal{
    public String name = "tortoise";
    @Override
    public void run() {
        System.out.println("tortoise running");
    }
}
