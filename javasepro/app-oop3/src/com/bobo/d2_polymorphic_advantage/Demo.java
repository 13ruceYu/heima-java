package com.bobo.d2_polymorphic_advantage;

public class Demo {
    public static void main(String[] args) {
        // 同类型的对象，执行同一个行为，会表现出不同的行为特征
        // 1. 多态形式：父类对象 对象名称 = new 子类构造器
        Animal dog = new Dog();
        Animal tortoise = new Tortoise();

        // 方法调用：编译看左边，运行看右边
        dog.run();
        tortoise.run();

        // 变量调用：编译看左边，运行也看左边（多态侧重行为多台）
        System.out.println(dog.name);
        System.out.println(tortoise.name);

        go(dog);
        go(tortoise);

        // 多态下子类不能调用自己的独有功能
        // dog.watch();
    }

    public static void go(Animal animal) {
        animal.run();
    }
}
