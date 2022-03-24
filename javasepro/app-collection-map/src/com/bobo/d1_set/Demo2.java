package com.bobo.d1_set;

public class Demo2 {
    public static void main(String[] args) {
        // hash value -> address value
        String foo = "foo";
        System.out.println(foo.hashCode());
        System.out.println(foo.hashCode());

        String bar = "";
        System.out.println(bar.hashCode());
        System.out.println(bar.hashCode());

        String doo = "";
        System.out.println(doo.hashCode());
        System.out.println(doo.hashCode());
    }
}
