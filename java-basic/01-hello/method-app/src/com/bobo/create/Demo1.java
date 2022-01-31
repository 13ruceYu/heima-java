package com.bobo.create;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：创建方法
        int sum1 = sum(3,5);
        System.out.println(sum1);
        int sum2 = sum(434,454);
        System.out.println(sum2);
    }
    public static int sum(int a, int b) {
        int res = a + b;
        return res;
    }
}
