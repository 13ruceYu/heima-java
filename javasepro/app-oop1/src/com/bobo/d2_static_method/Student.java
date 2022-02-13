package com.bobo.d2_static_method;

public class Student {
    private String name;
    private int age;

    /**
     * 实例方法：无 static 修饰符，属于对象，可以访问对象的成员变量
     */
    public void study() {
        System.out.println(name + "同学，正在学习");
    }

    /**
     * 静态方法：有 static 修饰符，属于类，可以被类和对象共享访问
     * @param a
     * @param b
     */
    public static void getMax(int a, int b) {
        System.out.println(a > b ? a : b);
    }

    public static void main(String[] args) {
        // 静态方法调用
        Student.getMax(10, 100);
        // 如果在同一类中，类名可以省略
        getMax(1,2);

        // 实例方法调用
        // study(); error: 只可以被实例调用
        Student s1 = new Student();
        s1.name = "zks";
        s1.study();
    }

}
