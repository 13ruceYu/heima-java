package com.bobo.d1_date;

import java.util.Date;

// target: 学会使用 Date 类处理时间，获取时间信息
public class Demo {
    public static void main(String[] args) {
        // 创建 Date 对象
        Date d = new Date();
        System.out.println(d);

        // get millis
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());
    }
}
