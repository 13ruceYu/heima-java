package com.bobo.service.impl;

import com.bobo.dao.UserDao;
import com.bobo.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("user service saving...");
    }
}
