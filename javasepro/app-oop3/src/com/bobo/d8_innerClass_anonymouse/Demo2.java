package com.bobo.d8_innerClass_anonymouse;

public class Demo2 {
    public static void main(String[] args) {
        // Student s = new Student();
        // go(s);
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        };
        go(s);

        Swim t = new Swim() {
            @Override
            public void swim() {
                System.out.println("老师游泳");
            }
        };
        go(t);
    }

    public static void go(Swim s) {
        System.out.println("ready...");
        s.swim();
        System.out.println("finish...");
    }
}

// class Student implements Swim {
//     @Override
//     public void swim() {
//         System.out.println("学生游泳。。。");
//     }
// }

interface Swim {
    void swim();
}
