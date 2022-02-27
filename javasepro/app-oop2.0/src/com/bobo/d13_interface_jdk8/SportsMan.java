package com.bobo.d13_interface_jdk8;

import com.bobo.d12_interface_extends.Sportsman;

public interface SportsMan {
    /**
     * 1. JDK 8 开始：默认方法（实例方法）
     * -- 必须用 default 修饰
     * -- 默认方法，接口不能创建对象，由实现类的对象调用
     */
    public default void run() {
        System.out.println("香港记者");
        skill();
    }

    /**
     * 2. 静态方法
     * -- 必须使用 static 修饰
     * -- 接口静态方法，必须接口名自己调用
     */
    public static void eat() {
        System.out.println("eat");
        // skill();
    }

    /**
     * 3. 私有方法
     * -- JDK 9 开始支持，必须使用 private 修饰
     * -- 必须在接口内部才能被访问
     */
    private void skill() {
        System.out.println("private skill");
    }
}

class SoccerMan implements SportsMan {

}

class Test {
    public static void main(String[] args) {
        SoccerMan sm = new SoccerMan();
        sm.run();
        SportsMan.eat();
    }
}
