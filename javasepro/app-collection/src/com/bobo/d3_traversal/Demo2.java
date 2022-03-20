package com.bobo.d3_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Demo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("whh");
        list.add("zks");
        list.add("lsd");

        System.out.println(list);

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(System.out::println);
    }
}
