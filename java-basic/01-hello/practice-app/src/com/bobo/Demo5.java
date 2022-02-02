package com.bobo;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        // target: 6 个评委，减去最高最低，平均
        int[] scoreList = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scoreList.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委打分：");
            scoreList[i] = sc.nextInt();
        }

        double res = getScore(scoreList);
        System.out.println("最终得分：" + res);
    }

    public static double getScore(int[] scoreList) {
        double res = 0;

        int max = scoreList[0];
        int min = scoreList[0];
        int sum = scoreList[0];
        for (int i = 1; i < scoreList.length; i++) {
            int curScore = scoreList[i];
            sum += curScore;
            if (curScore > max) {
                max = curScore;
            }
            if (curScore < min) {
                min = curScore;
            }
        }

        res =(double) ((sum - max - min) * 1.0 / (scoreList.length - 2));

        return res;
    }
}
