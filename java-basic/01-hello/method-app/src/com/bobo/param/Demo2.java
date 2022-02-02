package com.bobo.param;

public class Demo2 {
    public static void main(String[] args) {
        // 目标：打印数组 [..,..,..]
        int[] arr1 = {23,344,45,3,2};
        printArr(arr1);
    }

    public static void printArr(int[] arr) {
        System.out.print('[');

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ",");
                }
            }
        }
        System.out.print(']');
    }
}
