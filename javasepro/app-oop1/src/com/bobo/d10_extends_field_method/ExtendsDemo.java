package com.bobo.d10_extends_field_method;

/**
 * 继承变量访问原则：就近访问
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.name);
        d1.showName();
    }
}

class Animal {
    public String name = "father animal";
}

class Dog extends Animal {
    public String name ="dog animal";
    {
        System.out.println(name + "code block");
    }
    public void showName() {
        System.out.println(name);
        String name = "method name";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
