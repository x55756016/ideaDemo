package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class hellowordCotroller {
    @RequestMapping("/hello")
    public String hello() {
        return "HELLO world!";

    }


}
