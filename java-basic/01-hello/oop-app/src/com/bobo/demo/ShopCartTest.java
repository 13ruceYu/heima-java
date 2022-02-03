package com.bobo.demo;

import java.util.Scanner;

public class ShopCartTest {
    public static void main(String[] args) {
        // 1. 定义商品类，用于后期创建商品对象
        // 2. 定义购物车对象，使用一个数组对象表示
        Goods[] shopCar = new Goods[100];
        // 3. 搭建操作架构
        while (true) {
            System.out.println("请您使用如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购物车：pay");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的命令：");
            String command = sc.next();

            switch (command) {
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有该操作");
                    break;
            }
        }
    }

    public static void addGoods(Goods[] shopCar, Scanner sc) {
        // 1. 录入用户购买的商品信息
        System.out.println("请输入购买商品的编号（不重复）：");
        int id = sc.nextInt();
        System.out.println("请输入购买商品的名称：");
        String name = sc.next();
        System.out.println("请输入购买商品的价格：");
        double price = sc.nextDouble();
        System.out.println("请输入购买商品的数量：");
        int buyNumber = sc.nextInt();

        // 2. 把商品信息封装成商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        // 3. 将商品添加到购物车
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }

        System.out.println("您的商品：" + g.name + "添加购物车成功！");
    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("=========查询购物车信息如下=========");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println(g.id + "\t\t" + g.name + "\t\t\t" + g.price + "\t\t\t" + g.buyNumber);
            } else {
                break;
            }
        }
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        // 根据用户输入的商品 id 获取商品对象
        while (true) {
            System.out.println("请输入要修改的商品 id：");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if (g == null) {
                System.out.println("sorry, 没有查询到该商品");
            } else {
                System.out.println("请输入您想要修改" + g.name + "的数量：");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("数量修改完成");
                queryGoods(shopCar);
                break;
            }
        }

    }

    public static Goods getGoodsById(Goods[] shopCar,int id) {
        Goods res = null;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                if(g.id == id) {
                    res = g;
                }
            } else {
                break;
            }
        }

        return res;
    }

    public static void payGoods(Goods[] shopCar) {
        double sum = 0;

        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                sum += g.price * g.buyNumber;
            } else {
                break;
            }
        }

        System.out.println("订单总金额为：" + sum);
    }

}
