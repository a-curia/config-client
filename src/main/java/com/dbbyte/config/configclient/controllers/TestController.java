package com.dbbyte.config.configclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class TestController {

    @Value("${foo.bar: DefaultValue}")
    private String configParam;

    @GetMapping(value = "/hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping(value = "/test")
    public String getConfigaram(){
        return configParam;
    }
}
