package com.bobo.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("whh", 12, 12.3);
        students[1] = new Student("zks", 14, 14.5);
        students[2] = new Student("lsd", 11, 10.2);

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });

        System.out.println(Arrays.toString(students));


    }
}
