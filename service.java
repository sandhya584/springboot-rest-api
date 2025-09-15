package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String getMessage() {
        return "This message is coming from Service class!";
    }
}
