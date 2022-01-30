package com.bobo;

public class Switch {
    public static void main(String[] args) {
        // switch 语句 注意：不支持 double, float, long 为 condition
        String cd = "mon";

        switch (cd) {
            case "mon":
                System.out.println("Monday");
                // break; 穿透了
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
