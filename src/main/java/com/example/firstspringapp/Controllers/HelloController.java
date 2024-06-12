package com.example.firstspringapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {
    @GetMapping("/print")
    public String printHello(String name)
    {
        return "Hello There my name is manoj";
    }
}
