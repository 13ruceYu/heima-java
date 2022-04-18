package com.bobo.service.impl;

import com.bobo.dao.UserDao;
import com.bobo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    // public void setUserDao(UserDao userDao) {
    //     this.userDao = userDao;
    // }


    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        // ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        // UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
