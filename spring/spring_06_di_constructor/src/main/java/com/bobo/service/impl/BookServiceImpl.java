package com.bobo.service.impl;

import com.bobo.dao.BookDao;
import com.bobo.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        this.bookDao.save();
        System.out.println("book service saving...");   
    }
}
