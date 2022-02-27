package com.bobo.d10_interface;

public interface SportsmanInterface {
    // 接口成员：JDK 1.8 之前只有常量 & 抽象方法
    // public static final 可以省略不写
    // public static final String DEFAULT_NAME = "BOBO";
    String DEFAULT_NAME = "BOBO";
    String[] NAME_LIST = {"whh", "zks"};

    // 抽象方法 public abstract 可以省略不写
    public abstract void eat();
    void run();
}
