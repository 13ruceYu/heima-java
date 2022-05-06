package com.bobo;

import com.bobo.dao.BookDao;
import com.bobo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        // get IoC container
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
