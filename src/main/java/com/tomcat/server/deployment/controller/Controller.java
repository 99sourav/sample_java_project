package com.tomcat.server.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controller {
    @PostMapping("/get")
    public String fetchData(){
        System.out.println("merge branch");
        System.out.println("conflicts");
        return "sourav";
    }
}
