package com.bobo.traverse;

public class Demo6 {
    public static void main(String[] args) {
        // 目标：冒泡排序数组，从小到大
        int[] intList = {2,54,12,5};

        for (int i = 0; i < intList.length; i++) {
            // i == 0, compare 3 times
            // i == 1, compare 2 times
            // i == 2, compare 1 times
            // i == 3, compare 0 time
            for (int j = 0; j < intList.length - 1 - i; j++) {
                if (intList[j] > intList[j + 1]) {
                    int temp = intList[j + 1];
                    intList[j + 1] = intList[j];
                    intList[j] = temp;
                }
            }
        }

        for (int i = 0; i < intList.length; i++) {
            System.out.print(intList[i] + "\t");
        }
    }
}
