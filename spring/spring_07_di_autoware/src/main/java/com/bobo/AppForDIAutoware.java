package com.bobo;

import com.bobo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDIAutoware {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) app.getBean("bookService");
        bookService.save();
    }
}
