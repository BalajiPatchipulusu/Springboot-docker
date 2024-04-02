package com.nagarro.springbootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringDockerController {
    @RequestMapping("/")
    public String HelloSpringDocker(){
        return "Hello this is Spring Docker";
    }
}
