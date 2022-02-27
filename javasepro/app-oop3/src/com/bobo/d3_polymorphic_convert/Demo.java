package com.bobo.d3_polymorphic_convert;

public class Demo {
    public static void main(String[] args) {
        // 自动类型转换
        Animal a = new Dog();
        a.run();

        // 强制类型转换
        Animal b = new Tortoise();
        Tortoise c = (Tortoise) b;
        c.shell();

        // Dog d = (Dog) b; // 该强制编译不报错，运行报错
        if (b instanceof Tortoise) {
            Tortoise d = new Tortoise();
            d.shell();
        } else if (b instanceof Dog) {
            Dog d = new Dog();
            d.eatShit();
        }
    }
}
