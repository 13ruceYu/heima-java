package com.bobo.operator;

public class Demo2 {
    public static void main(String[] args) {
        // 需求：拆分 3 位数，分别输出个位，十位，百位
        int num = 234;

        int single = num % 10;
        int ten = num / 10 % 10;
        int hundred = num / 100;
        System.out.println(single);
        System.out.println(ten);
        System.out.println(hundred);
    }
}
