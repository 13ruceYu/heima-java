package com.bobo.d5_enum;

/**
 * 枚举类：
 * 1、枚举类都是继承了枚举类型：java.lang.Enum
 * 2、枚举都是最终类，不可以被继承
 * 3、构造器的构造器都是私有，枚举对外不能创建对象
 * 4、枚举类的第一行默认都是罗列枚举对象的名称
 * 5、枚举类相当于是多例模式
 */
public enum Demo1 {
    // 第一行罗列枚举类的对象名称，建议全部大写
    SPRING, SUMMER, AUTUMN, WINTER;
}
