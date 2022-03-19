package com.bobo.d9_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        Integer[] age = {12, 44, 2, 4556};

        Arrays.sort(age, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o1 - o2;
            }
        });

        System.out.println(Arrays.toString(age));

        Arrays.sort(age, (Integer a, Integer b) -> {
            return b - a;
        });

        System.out.println(Arrays.toString(age));

        Arrays.sort(age, (a, b) -> a - b);
        System.out.println(Arrays.toString(age));
    }
}
