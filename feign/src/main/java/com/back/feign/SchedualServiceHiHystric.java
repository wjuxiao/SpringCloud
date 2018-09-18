package com.back.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayFromClientOne(String name) {
        return "hi," + name + ",Sorry,Error!";
    }

}
