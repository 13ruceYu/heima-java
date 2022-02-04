package com.bobo.encapsulate;

public class Person {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 200 || age < 0) {
            System.out.println("illegal age");
        } else {
            this.age = age;
        }
    }
}
