package com.bobo.type;

public class ExpressionConversion {
    public static void main(String[] args) {
        byte a = 1;
        int b = 3;
        double c = 1.0;
        double d = a + b + c;

        double e = a - 1.0;

        byte f = 1;
        byte g = 2;
        // byte h = f + g; 报错：byte 运算时采用 int 类型
        int h = f + g;
    }
}
