package com.example.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String get(){
        return "hello";
    }
    @GetMapping("/hello")
    public String get1(){
        return "hello world";
    }
}
