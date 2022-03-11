package com.bobo.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo5Duration {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime birth = LocalDateTime.of(1997, 4, 6, 12, 4, 33);
        System.out.println(birth);

        Duration dn = Duration.between(birth, now);
        System.out.println(dn);
        System.out.println(dn.toDays());
    }
}
