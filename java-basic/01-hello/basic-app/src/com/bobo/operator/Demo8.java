package com.bobo.operator;

public class Demo8 {
    public static void main(String[] args) {
        // 目标：学会使用三元运算符
        int a = 1;
        int b = 2;
        String res = a > b ? "a 大" : "b 大";
        System.out.println(res);

        System.out.println("--------案例---------");
        int c = 10;
        int d = 20;
        int e = 30;

        int ret = c > d ? (c > e ? c : e) : (d > e ? d : e);
        System.out.println(ret);
    }
}
