package com.github.fish56.HelloSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class Books {
    @GetMapping
    public String booksList(){
        return "books router";
    }

    @GetMapping("/{tid}")
    public String getBookById(@PathVariable int tid){
        return "This is book " + tid;
    }

    @GetMapping("/{type}/{author}")
    public String getBook(@PathVariable String type, @PathVariable String author){
        return String.format("Type of this book: %s; Author: %s", type, author);
    }
}