package com.bobo.d6_regex;

public class Demo {
    public static void main(String[] args) {
        System.out.println(checkQQ("22222a"));
        System.out.println(checkQQ("22222"));
        System.out.println(checkQQ("2222233"));
    }

    public static boolean checkQQ(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }
}
