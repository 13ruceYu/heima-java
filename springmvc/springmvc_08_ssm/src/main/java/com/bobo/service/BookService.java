package com.bobo.service;

import com.bobo.domain.Book;

import java.util.List;

public interface BookService {
    /**
     * save book
     * @param book
     * @return
     */
    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();
}
