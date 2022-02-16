package com.bobo.d13_extends_constructor2;

public class Child extends Parent{
    String a;
    public Child(String name, int age, String a) {
        super(name, age);
        this.a = a;
    }
}
