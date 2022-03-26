package com.bobo.d6_map_api;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("whh", 11);
        list.put("lsd", 12);
        list.put("zks", 14);

        System.out.println(list.values());
        System.out.println(list.keySet());
        System.out.println(list.size());
        System.out.println(list.containsKey("whh"));
        System.out.println(list.containsValue(222));
        System.out.println(list.get("zks"));
        System.out.println(list.isEmpty());
    }
}
