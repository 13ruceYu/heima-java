package com.bobo.traverse;

import java.util.Random;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // target: guess num
        int[] intList = new int[5];
        Random rd = new Random();
        for (int i = 0; i < intList.length; i++) {
            intList[i] = rd.nextInt(20) + 1;
        }

        System.out.println("请输入 1-20 的整数进行猜测：");
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            int inputNum = sc.nextInt();

            for (int i = 0; i < intList.length; i++) {
                if (inputNum == intList[i]) {
                    System.out.println("恭喜您猜对了");
                    break OUT; // 结束外部循环
                }
            }
            System.out.println("猜错了，请您继续：");
        }

        for (int i : intList) {
            System.out.println(i);
        }

    }
}
