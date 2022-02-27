package com.bobo.d7_abstract_demo;

public abstract class Card {
    private String name; // 持有人名字
    private double money; // 卡内余额

    // 不同卡片的支付方式不同，具体子类实现
    public abstract void pay(double money);

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
