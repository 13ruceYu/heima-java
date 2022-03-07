package com.bobo.d10_objects;

import java.util.Objects;

// target: learn objects method: equals
public class Demo {
    public static void main(String[] args) {
        String a = null;
        String b = "b";

        // System.out.println(a.equals(b));
        System.out.println(Objects.equals(a, b));

        // public static boolean equals(Object a, Object b) {
        //     return (a == b) || (a != null && a.equals(b));
        // }
    }

}
