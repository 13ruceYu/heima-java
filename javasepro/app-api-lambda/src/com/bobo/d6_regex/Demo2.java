package com.bobo.d6_regex;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        checkPhone();
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入您的注册手机号：");
            String phone = sc.next();
            System.out.println(phone);

            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("手机号正确，注册完成");
                break;
            } else {
                System.out.println("格式有误");
            }
        }
    }
}
