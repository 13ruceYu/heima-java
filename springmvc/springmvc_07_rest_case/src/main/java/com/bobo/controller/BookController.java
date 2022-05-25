package com.bobo.controller;

import com.bobo.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book save ===>" + book);
        return "book save success";
    }

    @GetMapping
    public List<Book> getAll() {

        List<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setName("the good part of JS");
        book1.setType("CS");
        book1.setDescription("JS language");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setName("Java Yo");
        book2.setType("CS");
        book2.setDescription("yoooo");
        bookList.add(book2);

        return bookList;
    }
}
