package com.bobo.dao.impl;

import com.bobo.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("UserDaoImpl 创建...");
    }

    public void init() {
        System.out.println("impl init...");
    }

    public void destroy() {
        System.out.println("impl destroy...");
    }

    @Override
    public void save() {
        System.out.println("user dao impl...");
    }
}
