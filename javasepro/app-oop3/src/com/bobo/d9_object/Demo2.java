package com.bobo.d9_object;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("bobo1", 'm', 22);
        Student s2 = new Student("huahua", 'f', 23);
        System.out.println(s1.equals(s2));
    }
}
