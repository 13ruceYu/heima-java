package com.bobo.d3_static_tool;

import java.util.Random;

public class ToolCaptcha {
    /**
     * 私有构造器：防止工具类实例化，产生冗余内存
     */
    private ToolCaptcha() {}

    public static String createCaptcha(int length) {
        if (length == 0) {
            length = 5;
        }
        String captcha = "";

        String chars = "abcdefghigklmnopqrstuvwxwz";
        Random rd = new Random();
        for (int i = 0; i < length; i++) {
            int index = rd.nextInt(chars.length());
            char charItem = chars.charAt(index);
            captcha += charItem;
        }

        return captcha;
    }
}
