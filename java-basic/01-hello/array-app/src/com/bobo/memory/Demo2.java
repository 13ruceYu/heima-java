package com.bobo.memory;

public class Demo2 {
    public static void main(String[] args) {
        // 目标：当两个变量指向同一个内存地址
        int[] intList = {1,2,3};
        int[] list2 = intList;

        intList[0] = 2222;
        System.out.println(list2[0]);
    }
}
