package com.spring.azure.demo.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringAzureDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
        System.out.println("hello");
    }


    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to my first spring azure demo application";
    }

}
