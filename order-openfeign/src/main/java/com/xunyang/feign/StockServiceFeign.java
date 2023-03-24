package com.xunyang.feign;


import com.xunyang.config.FeignConfig;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service", path = "/stock")
public interface StockServiceFeign {

    @RequestMapping("/reduct")
    String reduct();
}
