package com.bobo.d7_arrays;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        // target: learn how to use Array class and common API
        int[] arr = {100, 3, 12, 454, 656};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString((arr)));

        int $index = Arrays.binarySearch(arr, 454);
        System.out.println($index);

        int $indexNotExit = Arrays.binarySearch(arr, 11);
        System.out.println($indexNotExit);
    }
}
