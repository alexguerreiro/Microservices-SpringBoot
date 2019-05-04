package com.example.limitsservice.controller;

import com.example.limitsservice.Config;
import com.example.limitsservice.beans.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {

    @Autowired
    private Config configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

    @GetMapping("fault-tolerance-example")
    @HystrixCommand(fallbackMethod = "fallbackRetrieveConfig")
    public LimitConfiguration retrieveConfig() {
        throw new RuntimeException("Not available");
    }

    public LimitConfiguration fallbackRetrieveConfig() {
        return new LimitConfiguration(9, 999);
    }
}
