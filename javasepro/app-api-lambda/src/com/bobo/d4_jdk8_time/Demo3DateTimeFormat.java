package com.bobo.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo3DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatter.format(ldt));
    }
}
