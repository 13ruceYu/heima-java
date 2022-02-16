package com.bobo.d12_extends_constructor;

public class Child extends Parent {
    public Child() {
        System.out.println("child cons executed");
    }

    public Child(String name) {
        System.out.println("child with param executed");
    }
}
