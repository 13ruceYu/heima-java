package com.bobo.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("whh", 11);
        list.put("lsd", 12);
        list.put("zks", 14);
        System.out.println(list);

        Set<Map.Entry<String, Integer>> entrySet = list.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            System.out.println(stringIntegerEntry);
            System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        }
    }
}
