package com.bobo.controller;

import com.bobo.domain.Book;
import com.bobo.exception.BusinessException;
import com.bobo.exception.SystemException;
import com.bobo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "搞事儿？");
        }

        try {
            int i = 1 / 0; // 异常测试
            Book book = bookService.getById(id);
            Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
            String msg = book != null ? "" : "数据查询失败，请重试。";

            return new Result(code, book, msg);
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_ERR, "服务区访问超时");
        }

    }

    @GetMapping
    public Result getAll() {

        List<Book> books = bookService.getAll();
        Integer code = books != null ? Code.GET_OK : Code.GET_ERR;
        String msg = books != null ? "" : "数据查询失败，请重试。";

        return new Result(code, books, msg);
    }
}
