package com.example.demo.service;

import org.springframework.stereotype.Service;

// Service theo mo hinh MVC
@Service
public class UserService {
    public String handleHello() {
        return "Hola service";
    }
}
