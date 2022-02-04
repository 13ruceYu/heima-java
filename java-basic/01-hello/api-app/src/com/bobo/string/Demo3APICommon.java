package com.bobo.string;

public class Demo3APICommon {
    public static void main(String[] args) {
        // target: 熟悉 string 常用 api
        // 1. length
        String s = "这 is a 字符串";
        System.out.println(s.length());

        // 2. charAt
        System.out.println(s.charAt(1));

        // 3. toCharArray
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            System.out.println(ca[i]);
        }

        // 4. substring
        String s2 = s.substring(0, 3);
        System.out.println(s2);
    }
}
