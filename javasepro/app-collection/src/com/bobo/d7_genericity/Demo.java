package com.bobo.d7_genericity;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(22);
        // intList.add("22"); error
    }
}
