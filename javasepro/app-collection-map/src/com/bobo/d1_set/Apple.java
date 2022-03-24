package com.bobo.d1_set;

public class Apple {
    private String color;
    private int count;
    private double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Apple() {
    }

    public Apple(String color, int count, double price) {
        this.color = color;
        this.count = count;
        this.price = price;
    }
}
