package com.bobo.string;

import java.util.Scanner;

public class Demo2APIEqual {
    public static void main(String[] args) {
        // target: 字符串比较
        String name = "bobo";
        String password = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String iname = sc.next();
        System.out.println("请输入密码：");
        String ipassword = sc.next();

        // if (name == iname && password == ipassword) {
        if (name.equals(iname) && password.equals(ipassword)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败，用户名或密码错误");
        }
    }
}
