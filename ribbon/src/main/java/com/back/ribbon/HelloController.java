package com.back.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService service;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return service.hiService(name);
    }
}
