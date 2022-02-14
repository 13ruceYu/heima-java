package com.bobo.d9_extends_feature;

/**
 * 子类不可以继承父类的构造器
 * 子类可以继承父类的私有(private)成员
 * 子类可以共享使用父类的静态成员，不是继承（存在争议
 */
public class ExtendsFeature {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.age);
        s1.run();
        // System.out.println(s1.count);
        // System.out.println(s1.num);
        Person p1 = new Person();
        // System.out.println(p1.num);
        // System.out.println(Person.num);
    }

}

class Person{
    private static int num;
    public static int count;
    private int age = 21;
    public void run() {
        System.out.println("person run");
    }
}

class Student extends Person{

}
