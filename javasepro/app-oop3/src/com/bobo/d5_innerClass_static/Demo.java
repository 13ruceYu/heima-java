package com.bobo.d5_innerClass_static;

public class Demo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner("inner", 12);
        inner.setAge(11);
        inner.show();
    }
}
