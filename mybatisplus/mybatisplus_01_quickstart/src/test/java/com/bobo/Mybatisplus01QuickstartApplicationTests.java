package com.bobo;

import com.bobo.dao.BookDao;
import com.bobo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void getAll() {
        List<Book> bookList = bookDao.selectList(null);
        System.out.println(bookList);
    }

    @Test
    void save() {
        Book book = new Book();
        book.setName("JavaScript 20 years");
        book.setType("computer language");
        book.setDescription("good book yo");
        book.setId(11);

        bookDao.insert(book);
    }

}
