package com.bobo;

import com.bobo.config.SpringConfig;
import com.bobo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = app.getBean(BookDao.class);

        String name = bookDao.findName(101, "hello args");

        System.out.println(name);
    }
}
