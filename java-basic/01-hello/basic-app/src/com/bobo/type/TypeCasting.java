package com.bobo.type;

public class TypeCasting {
    public static void main(String[] args) {
        // 强制类型转换
        int a = 12;
        // byte b = a; 报错
        byte b = (byte) a; // 强制类型转换
        System.out.println(b);

        int c = 166;
        byte d = (byte) c;
        System.out.println(d);

        double e = 88.8;
        int f = (int) e;
        System.out.println(f);
    }
}
