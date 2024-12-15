package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Book book() {
        return new Book();
    }

    @Bean
    public Author author() {
        return new Author();
    }

    @Bean
    public Publisher publisher() {
        return new Publisher();
    }
}
