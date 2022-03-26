package com.bobo.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("whh", 11);
        list.put("lsd", 12);
        list.put("zks", 14);

        Set<String> keys = list.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + list.get(key));
        }
    }
}
