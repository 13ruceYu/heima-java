package com.bobo.arrayList;

import java.util.ArrayList;

public class Demo3APIs {
    public static void main(String[] args) {
        // target: 了解使用 ArrayList 的 api
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Redis");
        strList.add("Yooo");

        // 1. get
        System.out.println(strList.get(0));

        // 2. size
        System.out.println(strList.size());

        // 3. remove(index)
        System.out.println(strList.remove(0));
        System.out.println(strList);

        // 4. remove(item)
        System.out.println(strList.remove("Yooo"));

        // 5. set
        strList.set(0, "change");
        System.out.println(strList);
    }
}
