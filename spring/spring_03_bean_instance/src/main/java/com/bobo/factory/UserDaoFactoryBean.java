package com.bobo.factory;

import com.bobo.dao.UserDao;
import com.bobo.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // @Override
    // public boolean isSingleton() {
    //     return false;
    // }
}
