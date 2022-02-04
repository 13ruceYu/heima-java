package com.bobo.constructor;

public class Test {
    public static void main(String[] args) {
        // target: 说出对象是通过构造器初始化出来的，并理解构造器的分类和区别
        // ⚠️ 注意事项：无参构造器默认存在，当定义有参构造器，无参构造器需要自己手动定义
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.price);

        Car c2 = new Car("Benz", 12.2);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
