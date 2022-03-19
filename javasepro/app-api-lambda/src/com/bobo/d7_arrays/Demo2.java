package com.bobo.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        Integer[] arr = {12, 12,4, 45, 1900, 34, 5456 };

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
