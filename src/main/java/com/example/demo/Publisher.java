package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Publisher {
    private String name;

    public Publisher() {
        this.name = "Reynal & Hitchcock";
    }

    public String getName() {
        return name;
    }
}
