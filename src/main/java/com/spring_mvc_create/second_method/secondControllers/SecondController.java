package com.spring_mvc_create.second_method.secondControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello from Second controller";
    }
}
