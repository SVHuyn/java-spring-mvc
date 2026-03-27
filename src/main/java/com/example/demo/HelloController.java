package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World update";
    }

    @GetMapping("/user")
    public String userPage() {
        return "User can access";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Admin can access";
    }
}
