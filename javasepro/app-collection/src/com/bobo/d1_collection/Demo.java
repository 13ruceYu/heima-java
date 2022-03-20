package com.bobo.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        // collection 是集合的代表
        // 可分为量大常用集合体系：List 和 set
        // List：有序，可重复，有索引
        // Set：无序，不重复，无索引
        Collection list1 = new ArrayList();
        list1.add(11);
        list1.add(11);
        list1.add(false);
        list1.add("string");
        System.out.println(list1);

        Collection list2 = new HashSet();
        list2.add(11);
        list2.add(11);
        list2.add(false);
        list2.add("string");
        System.out.println(list2);

        Collection<String> list3 = new ArrayList<>();
        list3.add("ssss");
        // list3.add(111);
        list3.add("string");
        System.out.println(list3);
    }
}
