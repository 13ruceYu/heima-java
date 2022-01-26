package com.bobo.dataType;

public class PrimitiveType {
    public static void main(String[] args) {
        // Java 基本数据类型：4 大类(integer、floating point、boolean、char) 8 小类
        /* 1. byte 字节型 1 byte -128～127 */
        byte by = 1;
        // by = 128; error

        /* 2. short 短整形 2 bytes */
        short sh = 23333;

        /* 3. int 整形 4 bytes */
        int in = 323232333;

        /* 4. long 长整形 8 bytes */
        // long lg = 3434343434; 报错：整数字面量默认为 int 类型，定义 long 要在后面加 L
        long lg = 3434343434L;

        /* 5. float 单精度浮点数 4 bytes */
        // float fl = 99.3; 报错：浮点数字面量默认为 double，定义 float 要在后面加 F
        float fl = 99.3F;

        /* 6. double 双精度浮点数 8 bytes */
        double dl = 9999999999.9999999;

        /* 7. char 字符类型 */
        char ch1 = '呀';
        char ch2 = 'a';

        /* 8. boolean 布尔类型 */
        boolean boo = false;

    }
}
