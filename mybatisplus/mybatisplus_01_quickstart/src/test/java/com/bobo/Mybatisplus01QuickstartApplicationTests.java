package com.bobo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Test
    void getByPage() {
        IPage page = new Page(1, 2);
        bookDao.selectPage(page, null);
        System.out.println("当前页：" + page.getCurrent());
        System.out.println("每页显示量：" + page.getSize());
        System.out.println("一共多少页：" + page.getPages());
        System.out.println("一共多少条数据：" + page.getTotal());

        System.out.println("当前分页数据：" + page.getRecords());
        System.out.println("新项目数据库环境搭建");
    }

}
