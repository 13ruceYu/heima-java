package com.bobo.dao.impl;

import com.bobo.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String database;
    private Integer connectionCount;

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    @Override
    public void save() {
        System.out.println("user dao saving..." + database + ", " + connectionCount);
    }
}
