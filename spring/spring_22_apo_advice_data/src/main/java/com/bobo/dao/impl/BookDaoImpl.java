package com.bobo.dao.impl;

import com.bobo.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public String findName(int id, String password) {
        System.out.println("id: " + id);
        return "bobo";
    }
}
