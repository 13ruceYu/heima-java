package com.bobo.d1_polymorphic;

public class Dog extends Animal {
    public String name = "son dog";
    @Override
    public void run() {
        System.out.println("dog running");
    }
}
