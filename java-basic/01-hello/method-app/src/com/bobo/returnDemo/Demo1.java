package com.bobo.returnDemo;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：明确 return 关键字的作用
        divide(12, 4);
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("输入有误，除数不可为 0");
            return;
        }

        System.out.println("结果为" + (a / b));
    }
}
