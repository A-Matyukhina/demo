package com.example.demo.controllers;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {
    private AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @GetMapping("/authors")
    List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }
    @GetMapping("/authors/{id}")
    Optional<Author> getAuthorById(@PathVariable Long id){
      return authorService.getAuthorById(id);
    }
    @PostMapping("/authors")
    Author addAuthor(@RequestBody Author newAuthor){
       return authorService.addAuthor(newAuthor);
    }
    @DeleteMapping("/authors")
    void deleteAuthor(@RequestBody Author author){
        authorService.deleteAuthor(author);
    }
}
