package com.bobo.d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameDemo {
    public static List<Card> allCards = new ArrayList<>();

    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠️", "♥️", "♣️", "♦️"};
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card card = new Card(size, color, index);
                allCards.add(card);
            }
        }

        Card joker1 = new Card("", "🃏", ++index);
        Card joker2 = new Card("", "🃟", ++index);

        allCards.add(joker1);
        allCards.add(joker2);

        System.out.println(allCards);
    }

    public static void main(String[] args) {
        // 洗牌
        Collections.shuffle(allCards);
        System.out.println(allCards);
        // 分牌
        List<Card> p1 = new ArrayList<>();
        List<Card> p2 = new ArrayList<>();
        List<Card> p3 = new ArrayList<>();

        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);

            if (i % 3 == 0) {
                p1.add(card);
            } else if (i % 3 == 1) {
                p2.add(card);
            } else {
                p3.add(card);
            }
        }

        List<Card> allThreeCard = allCards.subList(allCards.size() - 3, allCards.size());
        sortCards(p1);
        System.out.println("p1" + p1);
        sortCards(p2);
        System.out.println("p2" + p2);
        sortCards(p3);
        System.out.println("p3" + p3);
    }

    public static void sortCards(List<Card> cards) {
        Collections.sort(cards, ((o1, o2) -> o1.getIndex() - o2.getIndex()));
    }
}
