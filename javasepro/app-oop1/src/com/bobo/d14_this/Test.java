package com.bobo.d14_this;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("bobo", "NB");
        System.out.println(s1.getName());
        System.out.println(s1.getSchool());

        Student s2 = new Student("niu");
        System.out.println(s2.getName());
        System.out.println(s2.getSchool());
    }
}
