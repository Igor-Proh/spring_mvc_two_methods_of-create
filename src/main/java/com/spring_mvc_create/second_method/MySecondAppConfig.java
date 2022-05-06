package com.spring_mvc_create.second_method;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(value = "com.spring_mvc_create.second_method")
@EnableWebMvc
public class MySecondAppConfig {
}
