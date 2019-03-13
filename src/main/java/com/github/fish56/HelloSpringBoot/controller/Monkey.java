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

    @GetMapping
    public String getMonkey(){
        return name;
    }
}
