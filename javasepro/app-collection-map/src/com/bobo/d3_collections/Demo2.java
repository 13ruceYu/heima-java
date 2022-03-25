package com.bobo.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Collections.addAll(apples, new Apple("red", 12.22, 23), new Apple("blue", 11.22, 22));
        System.out.println(apples);
        Collections.sort(apples, ((o1, o2) -> o1.getWeight() - o2.getWeight()));
        System.out.println(apples);
    }
}
