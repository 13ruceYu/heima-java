package com.bobo;

import com.bobo.dao.UserDao;
import com.bobo.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
        // UserDaoFactory userDaoFactory = new UserDaoFactory();
        //
        // UserDao userDao = userDaoFactory.getUserDao();
        //
        // userDao.save();

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
