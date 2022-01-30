package com.bobo.traverse;

public class Demo2 {
    public static void main(String[] args) {
        // target: traverse to get sum
        int[] intList = {12, 34, 45, 34};
        int sum = 0;
        for (int j : intList) {
            System.out.println(j);
            sum += j;
        }
        System.out.println(sum);
    }
}
