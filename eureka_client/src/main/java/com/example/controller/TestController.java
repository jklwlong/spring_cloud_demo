package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
