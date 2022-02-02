package com.bobo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        // target: 双色球系统，6 红球（1-33，不重复）+ 1 蓝球（1-16）
        // 1、随机中奖号码
        int[] luckyNumbers = createLuckyNumbers();
        System.out.println(Arrays.toString(luckyNumbers));
        // 2、录入用户号码
        int[] userNumbers = userInputNumbers();
        System.out.println(Arrays.toString((userNumbers)));
        // 3、判断中奖情况
        judge(luckyNumbers, userNumbers);
    }

    public static int[] createLuckyNumbers() {
        // a、定义一个长度为 7 的整数数组
        int[] numbers = new int[7];

        Random rd = new Random();
        // b、先生成前 6 位红球数字（1-33，不可重复）
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                int num = rd.nextInt(33) + 1;

                boolean flag = true; // 默认没有重复

                for (int j = 0; j < i; j++) {
                    if (numbers[j] == num) {
                        flag = false;
                    }
                }

                if (flag) {
                    numbers[i] = num;
                    break;
                }
            }
        }

        numbers[numbers.length - 1] = rd.nextInt(16) + 1;

        return numbers;
    }

    public static int[] userInputNumbers() {
        int[] numbers = new int[7];

        // a. 录入 6 个红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "位红球数字：");
                int num = sc.nextInt();

                boolean flag = true;

                for (int j = 0; j < i; j++) {
                    if (num == numbers[j]) {
                        flag = false;
                        System.out.println("数字 " + num + " 已存在");
                    }
                    if (num > 33 || num < 1) {
                        flag = false;
                        System.out.println("请输入合法的红球数字（1-33）");
                    }
                }

                if (flag) {
                    numbers[i] = num;
                    break;
                }
            }
        }

        System.out.println("请输入第" + numbers.length + "位蓝球数字：");
        while (true) {
            int blue = sc.nextInt();
            if (blue > 16 || blue < 1) {
                System.out.println("请输入合法的蓝球数字(1-16)：");
            } else {
                numbers[numbers.length - 1] = blue;
                break;
            }
        }

        return numbers;
    }

    public static void judge(int[] luckyNumbers, int[] userNumbers) {
        System.out.println("中奖号码为：" + Arrays.toString(luckyNumbers));
        System.out.println("投注号码为：" + Arrays.toString(userNumbers));

        int redHitCount = 0;
        int blueHitCount = 0;

        for (int i = 0; i < luckyNumbers.length - 1; i++) {
            for (int j = 0; j < userNumbers.length - 1; j++) {
                if (luckyNumbers[i] == userNumbers[j]) {
                    redHitCount++;
                    break;
                }
            }
        }

        blueHitCount = luckyNumbers[luckyNumbers.length - 1] == userNumbers[userNumbers.length - 1] ? 1 : 0;

        System.out.println("红球中奖" + redHitCount + "位");
        System.out.println("蓝球中奖" + blueHitCount + "位");

        if (blueHitCount == 1 && redHitCount < 3) {
            System.out.println("恭喜，中奖 5 元");
        } else if (blueHitCount == 0 && redHitCount == 4 ||
                blueHitCount == 1 && redHitCount == 3) {
            System.out.println("恭喜，中奖 10 元");
        } else if (blueHitCount == 0 && redHitCount == 5 ||
                blueHitCount == 1 && redHitCount == 4) {
            System.out.println("恭喜，中奖 200 元");
        } else if (blueHitCount == 1 && redHitCount == 5) {
            System.out.println("恭喜，中奖 3000 元");
        } else if (blueHitCount == 0 && redHitCount == 6) {
            System.out.println("恭喜中奖 500 万元");
        } else if (blueHitCount == 1 && redHitCount == 6) {
            System.out.println("恭喜中奖 1000 万元");
        } else {
            System.out.println("没中奖");
        }
    }
}
