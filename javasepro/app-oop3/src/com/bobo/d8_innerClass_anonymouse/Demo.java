package com.bobo.d8_innerClass_anonymouse;

/**
 * 学习匿名内部类的形式与特点
 * 匿名内部类是一个没有名字的内部类
 * 匿名内部类写出来就会产生一个匿名内部类的对象
 * 匿名内部类的对象类型相当于是当前 new 的那个类型的子类类型
 *
 * 方便创建子类，简化代码编写
 */
public class Demo {
    public static void main(String[] args) {
        // Animal t = new Tiger();
        // t.run();

        Animal t = new Animal() {
            @Override
            public void run() {
                System.out.println("running");
            }
        };
        t.run();
    }
}

// class Tiger extends Animal {
//     @Override
//     public void run() {
//         System.out.println("Tiger running");
//     }
// }

abstract class Animal {
    public abstract void run();
}
