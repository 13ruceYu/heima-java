package com.bobo.d6_single_instance;

/**
 * 目标：学会使用饿汉单例方式定义类
 */
public class SingleInstance1 {
    // 1. 私有构造器
    private SingleInstance1() {}
    // 2. 定义一个公开的静态的成员变量存储一个类的对象
    public static SingleInstance1 instance = new SingleInstance1();
}
