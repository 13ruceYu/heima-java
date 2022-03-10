package com.bobo.d2_simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(sd.format(d));

        long unixTS = System.currentTimeMillis();
        System.out.println(unixTS);
        System.out.println(sd.format(unixTS));

    }
}
