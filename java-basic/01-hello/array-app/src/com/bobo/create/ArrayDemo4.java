package com.bobo.create;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 目标：掌握动态初始化元素默认值的规则
        // 1. int
        int[] intArr = new int[5];
        System.out.println(intArr[0]);
        System.out.println(intArr[4]);

        // 2. char
        char[] arrChar = new char[5];
        System.out.println((int)arrChar[0]);
        System.out.println((int)arrChar[4]);

        // 3. float num
        double[] doublesArr = new double[5];
        System.out.println(doublesArr[0]);
        System.out.println(doublesArr[4]);

        // 4. boolean
        boolean[] booleansArr = new boolean[5];
        System.out.println(doublesArr[0]);
        System.out.println(doublesArr[4]);

        // 5. reference
        String[] stringsArr = new String[5];
        System.out.println(stringsArr[0]);
        System.out.println(stringsArr[4]);
    }
}
