package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookInfoPrinter {

    private final Publisher publisher;
    private final Author author;
    private final Book book;

    @Autowired
    public BookInfoPrinter(Publisher publisher, Author author, Book book) {
        this.publisher = publisher;
        this.author = author;
        this.book = book;
    }

    public void printBookInfo() {
        System.out.println("Publisher: " + publisher.getName());
        System.out.println("Author: " + author.getName());
        System.out.println("Book: \"" + book.getTitle() + "\"");
    }
}
