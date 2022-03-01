package com.bobo.d5_innerClass_static;

public class Outer {
    // 学习静态成员内部类
    public static class Inner {
        private String name;
        private Number age;

        private static String sName;

        public Inner(String name, Number age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(Number age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Number getAge() {
            return age;
        }

        public void show() {
            System.out.println("name: " + name);
        }
    }
}
