package com.github.fish56.HelloSpringBoot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monkey")
public class Monkey {

    @Value("${monkey.name}")
    private String name;

    @Value("${database.url}")
    private String url;

    @Value("${db_password}")
    private String password;

    @GetMapping("/password")
    public String getPassword(){
        return password;
    }

    @GetMapping("/url")
    public String getUrl(){
        return url;
    }

    @GetMapping
    public String getMonkey(){
        return name;
    }
}
