package com.bobo;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        // 猜随机数
        Random rd = new Random();
        int num = rd.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入您猜测的数字(0-100)：");
            int input = sc.nextInt();

            if (input > num) {
                System.out.println("大了，往小猜");
            } else if (input < num) {
                System.out.println("小了，往大猜");
            } else {
                System.out.println("恭喜，猜对了");
                break;
            }
        }



    }
}
