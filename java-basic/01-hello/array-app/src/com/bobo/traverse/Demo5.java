package com.bobo.traverse;

import java.util.Random;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        // target: 录入员工编号，并随机排序
        int[] arrList = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrList.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位员工的编号：");
            int input = sc.nextInt();
            arrList[i] = input;
        }

        Random rd = new Random();
        for (int i = 0; i < arrList.length; i++) {
            int randomIndex = rd.nextInt(arrList.length);
            int temp = arrList[i];
            arrList[i] = arrList[randomIndex];
            arrList[randomIndex] = temp;
        }

        for (int i : arrList) {
            System.out.println(i);
        }
    }
}
