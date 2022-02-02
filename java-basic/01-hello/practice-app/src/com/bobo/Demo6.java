package com.bobo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        // target: 数字加密 +5 再 %10 再反转数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个数字");
            arr[i] = sc.nextInt();
        }
        System.out.println("您输入的数字为：" + Arrays.toString(arr));

        int[] encryptArr = encryptArr(arr);

        System.out.println("加密后的数字为：" + Arrays.toString((encryptArr)));
    }

    public static int[] encryptArr(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // +5 %10
            res[i] = (arr[i] + 5) % 10;
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = res[i];
            res[i] = res[j];
            res[j] = temp;
        }

        return res;
    }
}
