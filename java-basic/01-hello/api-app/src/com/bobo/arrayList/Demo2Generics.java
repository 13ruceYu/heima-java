package com.bobo.arrayList;

import java.util.ArrayList;

public class Demo2Generics {
    public static void main(String[] args) {
        // target: 通过范型限定 arraylist 的元素类型
        ArrayList<String> strList = new ArrayList<String>();

        strList.add("hello");
        // strList.add(111);
    }
}
