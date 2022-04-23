package com.bobo.dao.impl;

import com.bobo.dao.UserDao;
import org.springframework.stereotype.Component;

// <bean id="userDao" class="com.bobo.dao.impl.UserDaoImpl"></bean>
@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao save...");
    }
}
