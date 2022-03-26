package com.example.demo.service;

import com.example.demo.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> getAllAuthors();
    Optional<Author> getAuthorById(Long id);
    Author addAuthor(Author author);
    void deleteAuthor(Author author);
}
