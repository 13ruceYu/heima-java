package com.bobo;

public class Account {
    private String cardId;
    private String username;
    private String password;
    private double money;
    private double quotaMoney;

    public Account() {
    }

    public Account(String cardId, String username, String password, double quotaMoney) {
        this.cardId = cardId;
        this.username = username;
        this.password = password;
        this.quotaMoney = quotaMoney;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }

    public String getCardId() {
        return cardId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getMoney() {
        return money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }
}
