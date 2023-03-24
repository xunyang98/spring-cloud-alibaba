package com.xunyang.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Value("${user.name}")
    String name;

    @Value("${kuangbiao.two}")
    String two;

    @RequestMapping("/get")
    public String get(){
        System.out.println(name + two);
        return name + two;
    }
}
