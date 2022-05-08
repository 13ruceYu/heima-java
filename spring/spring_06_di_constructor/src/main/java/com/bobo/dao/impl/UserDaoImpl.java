package com.bobo.dao.impl;

import com.bobo.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String database;
    private Integer count;

    public UserDaoImpl(String database, Integer count) {
        this.database = database;
        this.count = count;
    }

    @Override
    public void save() {
        System.out.println("user dao saving..." + this.database + ", " + this.count);
    }
}
