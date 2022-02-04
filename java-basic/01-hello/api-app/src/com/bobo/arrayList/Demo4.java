package com.bobo.arrayList;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        // target: 遍历删除
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(77);
        intList.add(68);
        intList.add(98);
        intList.add(78);
        intList.add(82);
        intList.add(65);

        System.out.println(intList);

        // 错误解法
        // for (int i = 0; i < intList.size(); i++) {
        //     if (intList.get(i) < 80) {
        //         intList.remove(i);
        //     }
        // }
        //
        // System.out.println(intList);

        for (int i = intList.size() - 1; i >= 0; i--) {
            if (intList.get(i) < 80) {
                intList.remove(i);
            }
        }
        System.out.println(intList);
    }
}
