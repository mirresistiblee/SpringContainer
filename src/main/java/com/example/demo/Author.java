package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Author {
    private String name;

    public Author() {
        this.name = "Antoine de Saint-Exupéry";
    }

    public String getName() {
        return name;
    }
}