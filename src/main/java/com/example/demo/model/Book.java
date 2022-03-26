package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity//связываем с базой данных
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
