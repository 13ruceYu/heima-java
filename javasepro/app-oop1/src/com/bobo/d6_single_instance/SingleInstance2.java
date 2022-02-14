package com.bobo.d6_single_instance;

/**
 * taget: 学会使用懒汉单例模式定义单例类
 */
public class SingleInstance2 {
    // 私有构造器
    private SingleInstance2() {
    }

    // 创建一个私有静态成员变量存储本类实例，勿初始化
    private static SingleInstance2 instance;

    public static SingleInstance2 getInstance() {
        if (instance == null) {
            instance = new SingleInstance2();
        }
        return instance;
    }

}
