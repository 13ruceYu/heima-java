package com.bobo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：根据季节、舱位计算机票价格，旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11-4月）头等舱7折，经济舱6.5折
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double price = sc.nextDouble();
        System.out.println("请输入机票月份：");
        int month = sc.nextInt();
        System.out.println("请输入机票舱位（经济舱｜头等舱）：");
        String type = sc.next();

        double fee = getFee(price, month, type);
        if (fee > 0) {
            System.out.println("机票的最终售价为：" + fee);
        }

    }

    public static double getFee(double price, int month, String type) {
        double res = -1;
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    res = price * 0.9;
                    break;
                case "经济舱":
                    res = price * 0.85;
                    break;
                default:
                    System.out.println("舱位输入有误（头等舱｜经济舱）");
                    break;
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            switch (type) {
                case "头等舱":
                    res = price * 0.7;
                    break;
                case "经济舱":
                    res = price * 0.65;
                    break;
                default:
                    System.out.println("舱位输入有误（头等舱｜经济舱）");
                    break;
            }
        } else {
            System.out.println("月份输入有误");
        }

        return res;
    }
}
