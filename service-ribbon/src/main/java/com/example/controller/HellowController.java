package com.example.controller;

import com.example.service.HellowService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/hellow")
@RestController
public class HellowController {
    @Resource
    HellowService hellowService;

    @RequestMapping("/h")
    public String hellow(String h) {
        System.out.println("--------------");
        return hellowService.hiservice(h);
    }
}
