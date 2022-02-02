package com.bobo;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        // 目标：数组深拷贝
        int[] arr = {23, 45, 56};
        int[] arr2 = cloneArr(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] cloneArr(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        return res;
    }
}
