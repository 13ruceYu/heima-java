package com.bobo.d3_static_tool;

public class Login {
    public static void main(String[] args) {
        System.out.println("验证码：" + ToolCaptcha.createCaptcha(5));
    }
}
