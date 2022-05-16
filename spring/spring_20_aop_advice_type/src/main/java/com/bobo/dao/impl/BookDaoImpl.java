package com.bobo.dao.impl;

import com.bobo.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void update() {
        System.out.println("book dao update...");
    }

    @Override
    public int select() {
        System.out.println("book dao select...");
        return 0;
    }
}
