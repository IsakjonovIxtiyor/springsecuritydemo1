package com.example.springsecuritydemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    @GetMapping("user")
    public String getTestUser(){
        return "Hello User";
    }
    @GetMapping("admin")
    public String getTestAdmin(){
        return "Hello Admin";
    }
}
