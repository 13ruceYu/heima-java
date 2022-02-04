package com.bobo.encapsulate;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.getAge());
        p.setAge(-23);
        p.setAge(34);
        System.out.println(p.getAge());
    }
}
