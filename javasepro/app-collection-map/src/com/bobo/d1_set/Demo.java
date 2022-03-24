package com.bobo.d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        // Set features: HashSet(LinkHashSet), TreeSet
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Java");
        set.add("Golang");
        set.add("Spring");
        set.add("JS");
        set.add("Golang");
        System.out.println(set); // 无序，不重复，无索引

        Set<String> set2 = new LinkedHashSet<>();

        set2.add("Java");
        set2.add("Java");
        set2.add("Golang");
        set2.add("Spring");
        set2.add("JS");
        set2.add("Golang");
        System.out.println(set2); // 有序，不重复，无索引
    }
}
