package com.bobo.d1_unchange_collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4); // immutable collection
        System.out.println(list);
        // list.set(0, 3); // compile error
        System.out.println(list);

        Set<String> set = Set.of("a", "b", "c");
        System.out.println(set);
        // set.add("d"); // error
        System.out.println(set);


        Map<String, Integer> map = Map.of("whh", 11, "lsd", 12);
        System.out.println(map);


    }
}
