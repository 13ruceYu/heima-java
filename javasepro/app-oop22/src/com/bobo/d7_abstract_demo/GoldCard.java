package com.bobo.d7_abstract_demo;

public class GoldCard extends Card{
    @Override
    public void pay(double money) {
        double realPay = money * 0.8;
        double lastMoney = getMoney() - realPay;
        System.out.println(getMoney() + "当前账户总额：" + getMoney() + "，本次消费" + realPay + "，消费后可用余额：" + lastMoney);
        setMoney(lastMoney);
    }
}
