package com.bobo.d5_map;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("whh", 22);
        map.put("lsd", 22);
        map.put("whh", 333);
        System.out.println(map);
    }
}
