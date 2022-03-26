package com.bobo.d8_map_example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        // 1. mock 80 students with selection
        String[] selections = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random rd = new Random();

        for (int i = 0; i < 80; i++) {
            sb.append(selections[rd.nextInt(selections.length)]);
        }
        System.out.println(sb);

        // define a Map count result
        Map<Character, Integer> infos = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (infos.containsKey(c)) {
                infos.put(c, infos.get(c) + 1);
            } else {
                infos.put(c, 1);
            }
        }
        System.out.println(infos);
    }
}
