package com.company.delivery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{
    @GetMapping("/api/hello")
    public String hello(){
        return"Hello, Shinokwolf! Your Spring Boot first trial run 26/10/2025";
    }
}