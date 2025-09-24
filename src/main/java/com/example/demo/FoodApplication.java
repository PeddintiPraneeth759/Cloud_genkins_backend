package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FoodApplication extends SpringBootServletInitializer {

    // This ensures Spring Boot runs inside external Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FoodApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FoodApplication.class, args);
    }
}
