package com.bobo.dao.impl;

import com.bobo.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao saving");
    }
}
