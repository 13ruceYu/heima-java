package com.bobo.memory;

public class Test {
    public static void main(String[] args) {
        Student a = new Student();
        a.name = "whh";
        a.age = 12;
        a.hobby = "sleep";
        a.intro();

        Student b = a;
        b.name = "zks";
        b.intro();
    }
}
