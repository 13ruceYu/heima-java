package com.bobo;

import com.bobo.service.BookService;
import com.bobo.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
