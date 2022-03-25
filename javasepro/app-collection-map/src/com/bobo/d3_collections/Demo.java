package com.bobo.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // names.add("whh");
        // names.add("lsd");
        // names.add("zks");
        Collections.addAll(names, "whh", "lsd", "zks");
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);

        List<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(12);
        integers.add(1);
        System.out.println(integers);
    }
}
