package com.bobo.service.impl;

import com.bobo.dao.BookDao;
import com.bobo.dao.impl.BookDaoImpl;
import com.bobo.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();

    @Override
    public void save() {
        System.out.println("book service saving...");
        bookDao.save();
    }
}
