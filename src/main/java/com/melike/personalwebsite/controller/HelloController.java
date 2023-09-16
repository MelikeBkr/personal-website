package com.melike.personalwebsite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/")
    public String home() {
        return "Welcome to the home page!";
    }

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello from Spring Boot!";
    }
}
