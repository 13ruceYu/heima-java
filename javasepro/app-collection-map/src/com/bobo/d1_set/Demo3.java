package com.bobo.d1_set;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student s1 = new Student("whh", 10);
        Student s2 = new Student("lsd", 11);
        Student s3 = new Student("lsd", 11);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);
    }
}
