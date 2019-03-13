package com.github.fish56.HelloSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fish")
public class Fish {
    @GetMapping("/str")
    public String str(){
        return "a fish";
    }

    @GetMapping("/map")
    public Map<String, String> map(){
        Map<String, String> map = new HashMap<>();
        map.put("class","fish");
        return map;
    }

    @GetMapping("/obj")
    public Object obj(){
        return new Person("Jack", 33);
    }

    @GetMapping("/list")
    public List<Person> list(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Bob",22));
        list.add(new Person("Jon",55));
        return list;
    }
}

class Person{
    private int age;
    public String name;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
