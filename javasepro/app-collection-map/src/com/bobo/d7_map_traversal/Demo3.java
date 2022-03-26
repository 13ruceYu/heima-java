package com.bobo.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Demo3 {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("whh", 11);
        list.put("lsd", 12);
        list.put("zks", 14);
        System.out.println(list);

        list.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + ": " + integer);
            }
        });

        list.forEach((k, v) -> {
            System.out.println(k + v);
        });
    }
}
