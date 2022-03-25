package com.bobo.d4_collection_test;

public class Card {
    private String size;
    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Card() {
    }

    public Card(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return size + "-" + color;
    }
}
