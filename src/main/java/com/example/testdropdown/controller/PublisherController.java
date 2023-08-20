package com.example.testdropdown.controller;

import com.example.testdropdown.model.Publisher;
import com.example.testdropdown.repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PublisherController {
    @Autowired
    PublisherRepo publisherRepo;

    @GetMapping("/publishers")
    public List<Publisher> getPublishers() {
        return publisherRepo.findAll();
    }
    @PostMapping("/publisher")
    @ResponseStatus(HttpStatus.CREATED)
    public Publisher addPublisher(@RequestBody Publisher publisher) {
        return publisherRepo.save(publisher);
    }
}
