package com.example.firstspringapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {
    @GetMapping("/print/{firstname}/{secondname}")
    public String printHello(@PathVariable String firstname,@PathVariable String secondname)
    {
        return "Hello There my name is "+firstname+" "+ secondname;
    }
}
