package com.bobo.operator;

public class Demo7 {
    public static void main(String[] args) {
        // 学习目标：逻辑运算符，多个布尔结果放在一起运算，返回一个布尔结果 & ｜ ！ ^
        boolean t = true;
        boolean f = false;

        System.out.println(t & f);
        System.out.println(t | f);
        System.out.println(!t);
        System.out.println(!f);
        System.out.println(t ^ f);
        System.out.println(t ^ t);

        System.out.println("-------- 短路运算符：&& || -----------");
        int a = 1;
        int b = 2;
        int c = 2;
        int e = 2;
        int g = 2;
        System.out.println(a > 2 & b++ > 0); // 执行 b++
        System.out.println(a > 2 && c++ > 0); // 不执行 c ++
        System.out.println(b);
        System.out.println(c);

        System.out.println(a < 2 | e++ > 0); // 执行
        System.out.println(a < 2 || g++ > 0); // 不执行
        System.out.println(e);
        System.out.println(g);
    }
}
