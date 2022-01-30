package com.bobo.operator;

public class Demo4 {
    public static void main(String[] args) {
        // 目标：学会使用 increment 和 decrement ++ --
        int a = 1;
        a++; // a = a + 1;
        System.out.println(a);
        ++a;
        System.out.println(a);

        // 先赋值后计算
        int num1 = 0;
        int b = num1++;
        System.out.println(b);
        System.out.println(num1);

        // 先计算后复制
        int num2 = 0;
        int c = ++num2;
        System.out.println(num2);
        System.out.println(c);

        System.out.println("-------- 拓展案例 ---------");
        int e = 4;
        int f = 8;
        int res = e-- - --f + 3 + e + f++ - --e;

        // e: 3 2
        // f: 7 8
        // res: 4 - 7 + 3 + 3 + 7 - 2

        System.out.println(e);
        System.out.println(f);
        System.out.println(res);

    }
}
