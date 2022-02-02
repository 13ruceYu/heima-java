package com.bobo;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        // 目标：实现输出指定位数随机验证码
        String code = getCaptcha(5);
        System.out.println(code);
    }

    public static String getCaptcha(int n) {
        String res = "";

        for (int i = 0; i < n; i++) {
            Random rd = new Random();
            int type = rd.nextInt(3); // 0: 大写字母；1：小写字母；2：数字
            switch (type) {
                case 0:
                    char ch = (char) (rd.nextInt(26) + 65);
                    res += ch;
                    break;
                case 1:
                    char ch1 = (char)(rd.nextInt(26) + 97);
                    res += ch1;
                    break;
                case 2:
                    res += rd.nextInt(10);
                    break;
                default:
                    break;
            }
        }

        return  res;
    }
}
