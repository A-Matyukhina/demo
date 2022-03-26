package com.example.demo.controllers;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/books")
    List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    Book getBookById(@PathVariable Long id){
       return bookService.getBookById(id);
    }
    @PostMapping("/books")
    Book addBook(@RequestBody Book newBook){
        return bookService.addBook(newBook);
    }
    @DeleteMapping("/book")
    void deleteBook(@RequestBody Book book ){
        bookService.deleteBook(book);
    }
}
