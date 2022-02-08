package com.bobo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        // 1. 账户对象容器
        ArrayList<Account> accounts = new ArrayList<>();

        // 2. 准备系统首页：登录、开户
        showMain(accounts);
    }

    public static void showMain(ArrayList<Account> accounts) {
        System.out.println("============欢迎进入首页============");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你想做的操作：");
            System.out.println("1. 登录");
            System.out.println("2. 开户");
            System.out.println("开始输入命令：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    login(accounts, sc);
                    break;
                case 2:
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您当前输入的操作命令不被支持！");
                    break;
            }
        }
    }

    /**
     * 完成用户登录
     *
     * @param accounts
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        if (accounts.size() == 0) {
            System.out.println("尚无账号，请先开户");
            return;
        }
        while (true) {
            System.out.println("请您输入登录卡号：");
            String cardId = sc.next();

            Account acc = getAccountByCardId(cardId, accounts);

            if (acc == null) {
                System.out.println("对不起，该卡号不存在");
            } else {
                while (true) {
                    System.out.println("请输入登录密码：");
                    String password = sc.next();

                    if (acc.getPassword().equals(password)) {
                        // 登录成功
                        System.out.println("恭喜" + acc.getUsername() + "登录成功");
                        showUserCommand(sc);
                    } else {
                        System.out.println("密码输入有误，请重新输入。");
                    }
                }
            }
        }
    }

    private static void showUserCommand(Scanner sc) {
    }

    /**
     * 用户开户
     *
     * @param accounts
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===========用户开户功能===========");
        // 2. 键盘录入 姓名 密码 确认密码
        System.out.println("请输入开户名称：");
        String name = sc.next();

        String password = "";

        while (true) {
            System.out.println("请输入开户密码：");
            password = sc.next();

            System.out.println("请重复开户密码：");
            String passwordRepeat = sc.next();

            // 判断密码输入是否一致
            if (!password.equals("") && password.equals(passwordRepeat)) {
                break;
            } else {
                System.out.println("两次密码不一致");
            }
        }

        System.out.println("请输入单次限额：");
        double quotaMoney = sc.nextDouble();

        // 3. 生成账户卡号，8位，且不可与其他账户卡号重复
        String cardId = createCardId(accounts);

        // 4. 创建 account 对象
        Account account = new Account(cardId, name, password, quotaMoney);

        // 5. 添加到集合中
        accounts.add(account);
        System.out.println("恭喜开户成功！您的卡号为：" + account.getCardId() + "，请妥善保管。");
    }

    public static String createCardId(ArrayList<Account> accounts) {
        String cardId = "";
        Random rd = new Random();
        while (true) {
            for (int i = 0; i < 8; i++) {
                cardId += rd.nextInt(10);
            }

            // 判断卡号是否重复
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                break;
            }
        }

        return cardId;
    }

    public static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        Account account = null;

        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                account = acc;
            }
        }

        return account;
    }
}
