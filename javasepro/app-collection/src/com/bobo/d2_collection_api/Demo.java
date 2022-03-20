package com.bobo.d2_collection_api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<String> list1 = new ArrayList<>();
        list1.add("whh");
        list1.add("zks");
        list1.add("lsd");
        System.out.println(list1);

        Iterator<String> it = list1.iterator();
        // String el = it.next();
        // System.out.println(el);
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());

        while (it.hasNext()) {
            String el = it.next();
            System.out.println(el);
        }
    }
}
