package com.example.testdropdown.repository;

import com.example.testdropdown.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer>{
}
