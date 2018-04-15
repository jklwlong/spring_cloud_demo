package com.example.service.impl;

import com.example.service.HellowService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
@Service
public class HellowServiceImpl implements HellowService {
    @Resource
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiservice(String h) {
        return restTemplate.getForObject("http://service-test1/test/hi?name=" + h, String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!!!!!!!!";
    }
}
