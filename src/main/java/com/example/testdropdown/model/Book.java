package com.example.testdropdown.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @NotNull
    private String title;

    @ManyToOne
    @JoinColumn(name = "authorId", referencedColumnName = "authorId")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "publisherId", referencedColumnName = "publisherId")
    private Publisher publisher;
}
