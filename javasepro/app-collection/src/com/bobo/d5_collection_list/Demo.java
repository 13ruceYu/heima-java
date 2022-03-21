package com.bobo.d5_collection_list;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Redis");
        System.out.println(list);

        list.add(2, "JS");
        System.out.println(list);

        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.set(0, "Golang"));
        System.out.println(list);

    }
}
