package com.bobo.param;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：参数传递机制：1、值传递；2、引用传递
        int val = 333;
        value(val);
        System.out.println(val);

        int[] list = {11,33};
        refer(list);
        System.out.println(list[0]);
    }

    public static void value(int val) {
        val = 20;
    }

    public  static void refer(int[] ref) {
        ref[0] = 22;
    }
}
