package com.bobo;

import com.bobo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        // DataSource dataSource = (DataSource) app.getBean("dataSource");

        DataSource dataSource = (DataSource) app.getBean("c3p0DataSource");

        BookDao bookDao = (BookDao) app.getBean("bookDao");

        System.out.println(dataSource);
        bookDao.save();

    }
}
