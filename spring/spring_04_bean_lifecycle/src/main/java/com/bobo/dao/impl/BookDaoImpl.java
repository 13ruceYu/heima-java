package com.bobo.dao.impl;

import com.bobo.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao saving...");
    }

    // bean init method
    public void init() {
        System.out.println("book dao init...");
    }

    // before bean destroy
    public void destroy() {
        System.out.println("book dao destroy...");
    }
}
