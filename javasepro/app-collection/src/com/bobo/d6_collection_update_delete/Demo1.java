package com.bobo.d6_collection_update_delete;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("PHP");
        linkedList.add("Golang");
        linkedList.add("Java");

        // 1. iterator delete
        // Iterator<String> it = linkedList.listIterator();
        // while (it.hasNext()) {
        //     String el = it.next();
        //     if ("Java".equals(el)) {
        //         // linkedList.remove();
        //         it.remove();
        //     }
        // }
        // System.out.println(linkedList);

        // 2. lambda
        // linkedList.forEach(el -> {
        //     if ("Java".equals(el)) {
        //         linkedList.remove();
        //     }
        // });
        // System.out.println(linkedList); // 报错

        // 3. foreach
        // for (String s : linkedList) {
        //     if ("Java".equals(s)) {
        //         linkedList.remove();
        //     }
        // }
        // System.out.println(linkedList); // 报错

        // 4. for
        for (int i = 0; i < linkedList.size(); i++) {
            if ("Java".equals(linkedList.get(i))) {
                linkedList.remove("Java");
            }
        }
        System.out.println(linkedList); // 正着删不行，倒着删可以
    }
}
