package com.back.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi service;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        System.err.println(name);
        return  service.sayFromClientOne(name);
    }
}
