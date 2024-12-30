package com.tomcat.server.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/fetch")
    public String fetchData(){
        System.out.println("request is processng...");
        return "hello world";
    }
}
