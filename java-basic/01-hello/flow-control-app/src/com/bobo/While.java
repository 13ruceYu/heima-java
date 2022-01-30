package com.bobo;

public class While {
    public static void main(String[] args) {
        // while 循环：珠穆拉玛峰的高度是 8848860mm，纸张厚度是 0.1mm，要折叠几次
        double mountainHeight = 8848860;
        double paperHeight = 0.1;
        int count = 0;
        while (paperHeight < mountainHeight) {
            count++;
            paperHeight *= 2;
        }
        System.out.println("折叠了" + count + '次');
    }
}
