package com.bobo.service.impl;

import com.bobo.dao.BookDao;
import com.bobo.dao.UserDao;
import com.bobo.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service saving...");
        bookDao.save();
        userDao.save();
    }
}
