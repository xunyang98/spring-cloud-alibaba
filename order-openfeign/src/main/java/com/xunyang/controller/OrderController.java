package com.xunyang.controller;

import com.xunyang.feign.ProductServiceFeign;
import com.xunyang.feign.StockServiceFeign;
import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockServiceFeign stockServiceFeign;

    @Autowired
    ProductServiceFeign productServiceFeign;


    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功!");
        String msg = stockServiceFeign.reduct();
        String proMsg = productServiceFeign.getProduct(1);
        return "下单成功!\n " + proMsg + " " + msg;
//        return "下单成功!\n " + msg;
    }
}
