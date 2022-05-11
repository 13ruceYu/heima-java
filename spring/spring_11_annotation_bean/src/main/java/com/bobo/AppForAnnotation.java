package com.bobo;

import com.bobo.config.SpringConfig;
import com.bobo.dao.BookDao;
import com.bobo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = app.getBean(BookDao.class);
        System.out.println(bookDao);
        BookService bookService = app.getBean(BookService.class);
        System.out.println(bookService);
    }
}
