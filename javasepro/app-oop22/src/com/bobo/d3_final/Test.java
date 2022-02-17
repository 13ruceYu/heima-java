package com.bobo.d3_final;

/**
 * 目标：明白 final 的一些基本语法
 */
public class Test {
    // public static final String schoolName;
    public static final String schoolName = "yo";
    public static void main(String[] args) {
        // schoolName = "hhh";
        // 3. final 修饰变量，变量仅能被赋值一次
        // 变量有几种？
        // 局部变量
        // 成员变量
        //   --1、静态成员变量
        //   --2、实例成员变量
        final int age;
        age = 11;
        // age = 12;
    }

    public static void buy(final double count) {
        // count = 11;
    }
}

// 1. final 修饰的类不能被继承 (String 类就是被 final 修饰的
final class Animal { }
// class Cat extends Animal{}

// 2. final 修饰方法不能被重写

class Person {
    public final void eat() {
        System.out.println("eat");
    }
}

class Child extends Person {
    // @Override
    // public void eat() {
    //     super.eat();
    // }
}

