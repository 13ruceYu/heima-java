package com.bobo.d9_object;

/**
 * 目标：掌握 Object 类中 toString 方法
 */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student("bobo", 'm', 25);
        System.out.println(s.toString());
        System.out.println(s);
    }
}
