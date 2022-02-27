package com.bobo.d2_polymorphic_advantage;

public class Dog extends Animal {
    public String name = "son dog";
    @Override
    public void run() {
        System.out.println("dog running");
    }
    public void watch() {
        System.out.println("watch gate");
    }
}
