package com.bobo.d1_set;

import java.util.Set;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(66);
        integers.add(87);
        integers.add(1);
        integers.add(42);
        System.out.println(integers);

        Set<String> strings = new TreeSet<>();
        strings.add("bobo");
        strings.add("Bo");
        strings.add("acg");
        strings.add("波");
        System.out.println(strings);

        Set<Apple> apples = new TreeSet<>();
        Apple a1 = new Apple("red", 11, 12.3);
        Apple a2 = new Apple("blue", 4, 32.3);
        Apple a3 = new Apple("pink", 44, 43.1);
        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
        System.out.println(apples);
    }
}
