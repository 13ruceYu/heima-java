package com.bobo.service.impl;

import com.bobo.dao.BookDao;
// import com.bobo.dao.impl.BookDaoImpl;
import com.bobo.service.BookService;

public class BookServiceImpl implements BookService {
    // delete service dao object with new
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service saving...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
