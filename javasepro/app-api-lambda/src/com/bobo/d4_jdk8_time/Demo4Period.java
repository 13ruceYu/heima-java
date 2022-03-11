package com.bobo.d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class Demo4Period {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birth = LocalDate.of(1997, 4, 6);
        System.out.println(birth);

        Period pd = Period.between(birth, today);
        System.out.println(pd);
        System.out.println(pd.getYears());
    }
}
