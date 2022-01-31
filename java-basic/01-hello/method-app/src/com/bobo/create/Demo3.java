package com.bobo.create;

public class Demo3 {
    public static void main(String[] args) {
        // 目标：判断为奇数还是偶数
        String res = oddOrEven(234234);
        System.out.println(res);
    }

    public static String oddOrEven(int a) {
        int mod = a % 2;
        String res = "";
        if (mod == 0) {
            res = "even";
        } else {
            res = "odd";
        }
        return res;
    }
}
