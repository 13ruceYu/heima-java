package com.bobo.overload;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：学习方法重载
        jump();
        jump("bobo");
        jump("bobo", 20);
    }

    public static void jump() {
        System.out.println("跳");
    }

    public static void jump(String name) {
        System.out.println(name + "跳");
    }

    public static void jump(String name, int count) {
        System.out.println(name + "跳" + count + "下");
    }
}
