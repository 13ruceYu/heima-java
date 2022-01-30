package com.bobo.traverse;

public class Demo3 {
    public static void main(String[] args) {
        // target: 取最值
        int[] intList = {12,45,1,45,56,74};
        int maxNum = intList[0];

        for (int i : intList) {
            if (i > maxNum) {
                maxNum = i;
            }
        }

        System.out.println(maxNum);
    }
}
