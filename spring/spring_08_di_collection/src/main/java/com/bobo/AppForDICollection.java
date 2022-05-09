package com.bobo;

import com.bobo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDICollection {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) app.getBean("bookDao");

        bookDao.save();
    }
}
