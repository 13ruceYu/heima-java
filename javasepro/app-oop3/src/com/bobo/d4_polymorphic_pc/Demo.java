package com.bobo.d4_polymorphic_pc;

public class Demo {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer c = new Computer("mac");
        c.start();

        // 创建键盘、鼠标对象
        USB k = new Keyboard("filco");
        c.installUSB(k);
        USB m = new Mouse("logitech");
        c.installUSB(m);
    }
}
