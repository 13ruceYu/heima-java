package com.bobo.d3_final;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        // final 修饰变量注意点
        // 1、修饰基本类型变量，变量储存的值不能发生改变
        final int a = 8;
        // a = 11;
        // 2、修饰引用类型变量，变量储存的地址不能发生改变
        final int[] arr = {11, 22};
        // arr = {33,44};
        arr[1] = 32;
        System.out.println(Arrays.toString(arr));
        System.out.println("墨鱼");
    }
}
