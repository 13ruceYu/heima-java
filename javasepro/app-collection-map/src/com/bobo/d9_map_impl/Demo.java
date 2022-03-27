package com.bobo.d9_map_impl;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // 1. 程序记录每个学生的情况
        Map<String, List<String>> data = new HashMap<>();

        // 存入选择
        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "A", "C");
        data.put("whh", selects1);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "B", "C");
        data.put("lsd", selects2);

        List<String> selects3 = new ArrayList<>();
        Collections.addAll(selects3, "A", "B");
        data.put("ztz", selects3);

        System.out.println(data);

        Map<String, Integer> infos = new HashMap<>();

        Collection<List<String>> values = data.values();
        System.out.println(values);
        for (List<String> value : values) {
            for (String s : value) {
                if (infos.containsKey(s)) {
                    infos.put(s, infos.get(s) + 1);
                } else {
                    infos.put(s, 1);
                }
            }
        }

        System.out.println(infos);
    }
}
