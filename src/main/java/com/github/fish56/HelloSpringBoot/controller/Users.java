package com.github.fish56.HelloSpringBoot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Users {
    @GetMapping
    public String withParam(@RequestParam String name, @RequestBody String body){
        return String.format("Header name is: %s; body is %s", name, body);
    }

    @PostMapping
    public String withHeader(@RequestHeader String name, @RequestBody String body){
        return String.format("Header name is: %s; body is %s", name, body);
    }

}
