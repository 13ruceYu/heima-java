package com.bobo;

import com.bobo.dao.BookDao;
import com.bobo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml.bak");

        BookDao bookDao = app.getBean(BookDao.class);
        BookService bookService = app.getBean(BookService.class);


        bookDao.save();
        bookService.save();
    }
}
