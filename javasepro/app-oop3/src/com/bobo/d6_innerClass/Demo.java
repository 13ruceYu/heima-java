package com.bobo.d6_innerClass;

public class Demo {
    public static void main(String[] args) {
        Test t = new Test();
        Test.Heart h = new Test().new Heart();
        h.show();
    }
}
