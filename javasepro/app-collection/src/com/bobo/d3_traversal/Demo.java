package com.bobo.d3_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("whh");
        list.add("zks");
        list.add("lsd");

        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }

        int[] list2 = {11, 233, 44};
        for (int i : list2) {
            System.out.println(i);
        }
    }
}
