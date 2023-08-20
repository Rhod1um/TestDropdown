package com.example.testdropdown.controller;

import com.example.testdropdown.model.Author;
import com.example.testdropdown.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin //(origins = "http://localhost:8080") er ikke 8080 men den port den selv åbner
public class AuthorController {
    @Autowired
    AuthorRepo authorRepo;

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return authorRepo.findAll();
    }
    @PostMapping("/author")
    @ResponseStatus(HttpStatus.CREATED)
    public Author addAuthor(@RequestBody Author author) {
        return authorRepo.save(author);
    }
}
