package com.bobo.create;

public class Demo2 {
    public static void main(String[] args) {
        // 目标：定义方法求 1-n 的和
        int sum100 = sum(100);
        System.out.println(sum100);
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
