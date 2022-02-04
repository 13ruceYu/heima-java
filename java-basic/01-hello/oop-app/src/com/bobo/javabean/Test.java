package com.bobo.javabean;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(23);
        p1.setHeight(168.0);
        p1.setName("whh");
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
        System.out.println(p1.getName());

        Person p2 = new Person("whh",12, 12);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getHeight());
    }
}
