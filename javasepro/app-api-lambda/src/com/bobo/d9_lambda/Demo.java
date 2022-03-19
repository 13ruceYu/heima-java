package com.bobo.d9_lambda;

public class Demo {
    public static void main(String[] args) {
        // target: 学会使用 lambda 表达式
        // goSwim(new Person() {
        //     @Override
        //     public void swim() {
        //         System.out.println("swimming....");
        //     }
        // });

        // 函数式
        goSwim(() -> {
            System.out.println("lambda swimming");
        });
    }

    public static void goSwim(Person p) {
        System.out.println("ready go");
        p.swim();
        System.out.println("finish");
    }
}

@FunctionalInterface
interface Person {
    void swim();
}
