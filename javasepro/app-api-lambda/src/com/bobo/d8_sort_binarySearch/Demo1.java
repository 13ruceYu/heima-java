package com.bobo.d8_sort_binarySearch;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        // target: 学会使用选择排序方法对数组排序
        int[] arr = {5, 1, 3, 2};

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if (arr[i] > arr[i1]) {
                    int temp = arr[i];
                    arr[i] = arr[i1];
                    arr[i1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
