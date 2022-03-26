package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book addBook(Book book);
    void deleteBook(Book book);
}
