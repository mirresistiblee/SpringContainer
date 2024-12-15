package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;

    public Book() {
        this.title = "The Little Prince";
    }

    public String getTitle() {
        return title;
    }
}

