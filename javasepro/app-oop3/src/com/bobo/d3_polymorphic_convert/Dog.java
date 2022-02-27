package com.bobo.d3_polymorphic_convert;

public class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("dog running");
    }

    public void eatShit() {
        System.out.println("dog eat shit");
    }
}
