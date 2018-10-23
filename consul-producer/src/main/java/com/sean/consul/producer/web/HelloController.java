package com.sean.consul.producer.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${myName:pig}")
    private String myName;

    @RequestMapping("/hello")
    public String hello() {
        return "hello consul：" + this.myName;
    }
}