package com.bobo.d1_static_field;

public class User {
    // 静态成员变量
    public static int onlineCount;
    // 实例成员变量
    private String name;
    private int age;

    public static void main(String[] args) {
        // 静态成员变量访问
        User.onlineCount++;
        System.out.println(onlineCount);

        // 实例成员变量访问
        User u1 = new User();
        System.out.println(u1.name);
        u1.age = 22;

        // 实例中可以访问静态成员变量，但是不推荐
        u1.onlineCount++;
        System.out.println(u1.onlineCount);
    }
}
