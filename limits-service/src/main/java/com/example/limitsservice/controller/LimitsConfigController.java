package com.example.limitsservice.controller;

import com.example.limitsservice.Config;
import com.example.limitsservice.beans.LimitConfiguration;
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
}
