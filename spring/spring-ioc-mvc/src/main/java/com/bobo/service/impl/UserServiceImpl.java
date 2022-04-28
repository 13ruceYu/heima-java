package com.bobo.service.impl;

import com.bobo.dao.UserDao;
import com.bobo.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void save() {
       userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
