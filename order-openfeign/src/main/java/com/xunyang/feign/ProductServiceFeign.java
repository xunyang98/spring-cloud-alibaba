package com.xunyang.feign;


import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import com.xunyang.config.FeignConfig;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service", path = "/product")
public interface ProductServiceFeign {

    @RequestMapping("/{id}")
//    @RequestLine("GET /{id}")
    String getProduct(@PathVariable("id") Integer id);  // @Param
}
