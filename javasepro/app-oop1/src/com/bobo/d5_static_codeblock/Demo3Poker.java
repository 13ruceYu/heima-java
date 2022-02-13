package com.bobo.d5_static_codeblock;

import java.util.ArrayList;

public class Demo3Poker {
    // 1. 准备一个容器储存 54 张牌
    static ArrayList<String> cards = new ArrayList<>();
    // 2. 静态代码块初始化 54 张牌
    static {
        String[] colors = {"♠︎", "♣︎", "♥︎", "♦︎"};
        String[] sizes = {"3", "4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(sizes[i] + colors[j]);
            }
        }
        cards.add("小🃟");
        cards.add("大🃟");
    }
    public static void main(String[] args) {
        System.out.println(cards);
    }
}
