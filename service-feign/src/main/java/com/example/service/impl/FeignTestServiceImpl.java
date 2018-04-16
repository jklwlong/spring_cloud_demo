package com.example.service.impl;

import com.example.service.FeignTestService;
import org.springframework.stereotype.Component;

@Component
public class FeignTestServiceImpl implements FeignTestService {
    @Override
    public String sayHi(String name) {
        return "sorry"+name;
    }
}
