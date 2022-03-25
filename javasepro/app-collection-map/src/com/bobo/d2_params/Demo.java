package com.bobo.d2_params;

public class Demo {
    public static void main(String[] args) {
        sum();
        sum(10, 11);
        sum(11, 12);
    }

    public static void sum(int... nums) {
        System.out.println(nums.length);
    }
}
