package com.example.controller;

import com.example.service.FeignTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/feign")
@RestController
public class FeignTestController {

    @Resource
    FeignTestService feignTestService;

    @RequestMapping("/f")
    public String feign(String name){
        return feignTestService.sayHi(name);
    }
}
