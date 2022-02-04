package com.bobo.string;

public class Demo1 {
    public static void main(String[] args) {
        // target: 通过 "" 创建的字符串对象，存放于堆内存的常量池中，如果相同，不重复创建，直接引用地址
        // 通过 new 构造器创建，则会在堆内存中分开存储
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "a" + "b" + "c";

        String s5 = "ab";
        String s6 = s5 + "a";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s6); // 因为 Java 编译优化机制所以相等

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s6);
    }
}
