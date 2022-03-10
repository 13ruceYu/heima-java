package com.bobo.d2_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        // learn parse
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String dateString = "2022-03-10 22:34:33";

        Date d = sdf.parse(dateString);
        System.out.println(d);
    }
}
