package com.bobo.arrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        // target: 创建 ArrayList 对象，添加元素
        ArrayList list = new ArrayList();

        list.add("stringItem");
        list.add(12);
        list.add('a');
        list.add(false);
        list.add(13.2);
        // list.add(con);
        System.out.println(list.add("return"));
        System.out.println(list);

        list.add(0, "first");
        System.out.println(list);
    }

    public static void con() {
        System.out.println("yoo");
    }
}
