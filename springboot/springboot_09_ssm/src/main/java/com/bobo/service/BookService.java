package com.bobo.service;

import com.bobo.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 通过 id 获取数据
     * @param id
     * @return
     */
    public Book getById(Integer id);

    public List<Book> getAll();
}
