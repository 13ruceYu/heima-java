package com.bobo;

import com.bobo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService1 = (BookService) ctx.getBean("serviceAlias1");
        BookService bookService2 = (BookService) ctx.getBean("serviceAlias2");
        System.out.println(bookService2);
        System.out.println(bookService1);
    }
}
