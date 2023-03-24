package com.xunyang.config;

import com.xunyang.intercepter.feign.CustomFeignIntercepter;
import feign.Contract;
import feign.Feign;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// 加@Configuration表示全局配置，不需要在@FeignClient中设置configuration属性
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }


    /*
    * 修改契约配置，支持Feign原生注解
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }*/

    /*
    * 超时时间设置
    @Bean
    public Request.Options options(){
        return new Request.Options(5000, 10000);
    }*/

    /*
    * 自定义拦截器配置
    @Bean
    public CustomFeignIntercepter feignAuthRequestInterceptor() {
        return new CustomFeignIntercepter();
    }*/
}

