package com.bobo.d3_calendar;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar cd = Calendar.getInstance();
        System.out.println(cd);

        int year = cd.get(Calendar.YEAR);
        System.out.println(year);
    }
}
