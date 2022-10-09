package com.vijaygenius123.dailycodebufferspringdemo.controller;

import com.vijaygenius123.dailycodebufferspringdemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/{id}")
    public String user(@PathVariable String id) {
        return id;

    }

    @GetMapping("/{path1}/{path2}")
    public String user(@PathVariable String path1, @PathVariable("path2") String str2) {
        return path1 + " " + str2;
    }

    @GetMapping("/user")
    public User user() {
        return User.builder()
                .id("1")
                .name("Vijay")
                .emailId("vijaygenius123@gmail.com")
                .build();

    }
}
