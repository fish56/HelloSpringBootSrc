package com.github.fish56.HelloSpringBoot.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/bear")
public class Bear {
    @GetMapping
    public ResponseEntity<String> entireRes(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("header aaa", "value bbb");
        return new ResponseEntity<>("hello world",
                headers, HttpStatus.FORBIDDEN);
    }

    @PostMapping
    public ResponseEntity<Object> entireResp(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("age", 22);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
