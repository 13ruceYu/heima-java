package com.bobo.d5_integer;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a; // 自动装箱
        System.out.println(a);
        System.out.println(a1);

        Integer it = 100;
        int it1 = it; // 自动拆箱
        System.out.println(it);

        // int age = null;
        Integer age1 = null; // 容错率更高

        // 1、包装类可以将基本类型的数据转换为字符串
        Integer i3 = 11;
        String st = i3.toString();
        int i4 = 11;
        // i4.toString(); error

        String num = "22";
        int realNum = Integer.parseInt(num);

        String numD = "22.2";
        double db = Double.parseDouble(numD);

        int rNum = Integer.valueOf(num);
        double dbb = Double.valueOf(numD);
    }
}
