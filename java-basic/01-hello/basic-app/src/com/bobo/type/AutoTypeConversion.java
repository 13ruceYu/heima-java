package com.bobo.type;

public class AutoTypeConversion {
    public static void main(String[] args) {
        // 自动类型转换：类型范围小的变量自动赋值给类型范围大的变量
        byte by = 12;
        int in = by; // 自动类型转换
        in = 22222;
        System.out.println(by);
        System.out.println(in);

        int age = 25;
        double ageDetail = age + 1;
        System.out.println(age);
        System.out.println(ageDetail);

        char ch = 'a';
        int aIndex = ch + 1 - 1;
        System.out.println(ch);
        System.out.println(aIndex);
    }
}
