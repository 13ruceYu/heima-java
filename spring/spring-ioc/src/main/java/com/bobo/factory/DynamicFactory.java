package com.bobo.factory;

import com.bobo.dao.UserDao;
import com.bobo.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
