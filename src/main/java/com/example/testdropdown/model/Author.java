package com.example.testdropdown.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer authorId;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private Set<Book> books = new HashSet<>();
}
