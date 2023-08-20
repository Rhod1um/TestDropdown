package com.example.testdropdown.controller;

import com.example.testdropdown.model.Book;
import com.example.testdropdown.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookRepo.findAll();
    }
    @PostMapping("/book")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }
}
