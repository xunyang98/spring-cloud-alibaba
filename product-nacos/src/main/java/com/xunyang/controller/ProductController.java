package com.xunyang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/{id}")
    public String getProduct(@PathVariable("id") Integer id){
//        Thread.sleep(4000);
        System.out.println("查询商品" + id);
        return "查询商品" + id + ":" + port;
    }

}
