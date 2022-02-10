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
                        showUserCommand(sc, acc, accounts);
                        return;
                    } else {
                        System.out.println("密码输入有误，请重新输入。");
                    }
                }
            }
        }
    }

    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("===========用户操作界面============");
            System.out.println("1. 查询账户");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 转账");
            System.out.println("5. 修改密码");
            System.out.println("6. 退出");
            System.out.println("7. 注销账户");
            System.out.println("请输入您的操作命令：");

            int command = sc.nextInt();

            switch (command) {
                case 1:
                    // 查询账户
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    depositMoney(acc, sc);
                    break;
                case 3:
                    // 取款
                    withdrawMoney(acc, sc);
                    break;
                case 4:
                    // 转账
                    transferMoney(accounts, acc, sc);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("退出成功！");
                    return;
                case 7:
                    break;
                default:
                    System.out.println("不支持该命令");
                    break;
            }
        }
    }

    private static void transferMoney(ArrayList<Account> accounts, Account acc, Scanner sc) {
        // 1. 判断系统中是否有两个及以上账户
        if(accounts.size() < 2) {
            System.out.println("系统中暂无其他账号，不支持转账操作");
            return;
        }

        // 2. 判断自己账户中是否有钱
        if (acc.getMoney() ==0) {
            System.out.println("您的余额为 0，无法转账");
            return;
        }

        // 3. 开始转账逻辑
        while (true) {
            System.out.println("请输入对方账户的卡号：");
            String cardId = sc.next();
            Account account = getAccountByCardId(cardId, accounts);
            if (account != null) {
                // 确认姓名操作
                // 不可为自己卡号
                if (acc.getCardId().equals(account.getCardId())) {
                    System.out.println("不可以给自己转账");
                } else {
                    String name = "*" + account.getUsername().substring(1);
                    System.out.println("请确认【" + name + "】的姓氏：");
                    String preName = sc.next();
                    if (account.getUsername().startsWith(preName)) {
                        // 开始转账
                        System.out.println("请输入转账金额：");
                        double money = sc.nextDouble();
                        if (money > acc.getMoney()) {
                            System.out.println("对比起，账户中没有这么多余额可转，可用余额："+ acc.getMoney());
                        } else {
                            acc.setMoney(acc.getMoney() - money);
                            account.setMoney(account.getMoney() + money);
                            System.out.println("转账成功");
                            showAccount(acc);
                            return;
                        }
                    } else {
                        System.out.println("对不起，姓氏认证失败");
                    }
                }
            } else {
                System.out.println("抱歉，无法查到卡号对应的用户");
            }
        }
    }

    private static void withdrawMoney(Account acc, Scanner sc) {
        System.out.println("========取款操作========");
        // 判断是否有钱
        if (acc.getMoney() > 0) {
            while (true) {
                System.out.println("请输入取款金额：");
                double amount = sc.nextDouble();
                // 与单次限额比较
                if (amount > acc.getQuotaMoney()) {
                    System.out.println("金额大于单次限额 " + acc.getQuotaMoney() +"，请重新输入");
                } else {
                    if(acc.getMoney() > amount) {
                        acc.setMoney(acc.getMoney() - amount);
                        System.out.println("取款成功");
                        showAccount(acc);
                        return;
                    } else {
                        System.out.println("余额不足");
                    }
                }
            }
        } else {
            System.out.println("余额为 0，请先存入。");
        }
    }

    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("=========存钱操作=======");
        System.out.println("请输入存款金额：");
        double amount = sc.nextDouble();
        acc.setMoney(acc.getMoney() + amount);
        System.out.println("存款完成");
        showAccount(acc);
    }

    private static void showAccount(Account acc) {
        System.out.println("==========展示当前账户详情==========");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("用户名：" + acc.getUsername());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("当次限额：" + acc.getQuotaMoney());
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
