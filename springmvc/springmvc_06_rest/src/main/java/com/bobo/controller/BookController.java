package com.bobo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/{id}")
    public String getBook(@PathVariable Integer id) {
        return "id: " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Integer id) {
        return "id: " + id;
    }
}
