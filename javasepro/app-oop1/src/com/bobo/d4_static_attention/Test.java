package com.bobo.d4_static_attention;

public class Test {
    /**
     * 静态方法只能访问静态成员，不可以直接!访问实例成员
     * 实例方法可以访问静态成员，可以访问实例成员
     * 静态方法中不可以出现 this 关键字
     */

    // 静态成员变量
    public static int onlineNumber;
    // 静态成员方法
    public static void yo() {
        System.out.println("static method");
    }
    // 实例成员变量
    private String name;

    public static void getMax() {
        System.out.println(onlineNumber);
        yo();
    }

    // 实例方法
    public void instanceMethod() {
        System.out.println(onlineNumber);
        System.out.println(name);
        yo();
        instanceMe();
    }

    public void instanceMe() {
        System.out.println('a');
    }



    public static void main(String[] args) {

    }
}
