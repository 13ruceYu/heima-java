package com.bobo.dao.impl;

import com.bobo.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component("bookDao")
@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String primitiveValue;

    @Override
    public void save() {
        System.out.println("book dao save..." + primitiveValue);
    }

    @PostConstruct
    public void init() {
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }
}
