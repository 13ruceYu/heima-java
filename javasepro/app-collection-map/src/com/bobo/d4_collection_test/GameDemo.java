package com.bobo.d4_collection_test;

import java.util.ArrayList;
import java.util.List;

public class GameDemo {
    public static List<Card> allCards = new ArrayList<>();

    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠️", "♥️", "♣️", "♦️"};

        for (String size : sizes) {
            for (String color : colors) {
                Card card = new Card(size, color);
                allCards.add(card);
            }
        }

        Card joker1 = new Card("", "🃏");
        Card joker2 = new Card("", "🃟");

        allCards.add(joker1);
        allCards.add(joker2);

        System.out.println(allCards);
    }

    public static void main(String[] args) {


    }
}
