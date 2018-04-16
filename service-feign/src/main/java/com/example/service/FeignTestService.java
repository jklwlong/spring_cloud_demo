package com.example.service;

import com.example.service.impl.FeignTestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-test1",fallback = FeignTestServiceImpl.class)
public interface FeignTestService {
    @RequestMapping(value = "/test/hi", method = RequestMethod.POST)
    String sayHi(@RequestParam("name") String name);
}
