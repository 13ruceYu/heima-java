package com.bobo.memory;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：了解 Java 内存分配，数组内存图
        // 方法区 ｜ 栈 ｜ 堆
        int[] intList = {1,3,4};
        System.out.println(intList);
        System.out.println(intList[0]);
        System.out.println(intList[1]);
    }
}
