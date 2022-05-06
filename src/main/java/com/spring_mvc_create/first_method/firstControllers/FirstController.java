package com.spring_mvc_create.first_method.firstControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello from First Controller";
    }
}
