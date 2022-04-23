package com.bobo.service.impl;

import com.bobo.dao.UserDao;
import com.bobo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// <bean id="userService" class="com.bobo.service.impl.UserServiceImpl">
// <property name="userDao" ref="userDao"></property>
// </bean>
@Component("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
