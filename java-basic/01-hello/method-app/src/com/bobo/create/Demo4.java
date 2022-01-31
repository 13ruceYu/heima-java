package com.bobo.create;

public class Demo4 {
    public static void main(String[] args) {
        int[] list1 = {12,34,12,33,212,445,2,3,34,45,5};
        System.out.println(max(list1));
    }

    public static int max(int[] intList) {
        int max = intList[0];
        for (int i : intList) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
