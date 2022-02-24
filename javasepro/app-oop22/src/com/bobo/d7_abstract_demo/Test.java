package com.bobo.d7_abstract_demo;

public class Test {
    public static void main(String[] args) {
        GoldCard gc = new GoldCard();
        gc.setMoney(10000);
        gc.setName("bobo");
        gc.pay(1000);
    }
}
