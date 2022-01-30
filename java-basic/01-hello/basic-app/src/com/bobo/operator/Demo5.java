package com.bobo.operator;

public class Demo5 {
    public static void main(String[] args) {
        // 目标：学会使用赋值运算符 += -= *= /+ %=
        byte a = 4;
        byte b = 3;
        a = (byte) (a + b); // 需要确定类型
        a += b; // 自动确定类型

        a -= b;
        a *= b;
        a /= b;
        a %= b;
        System.out.println(a);
        System.out.println(b);
    }
}
