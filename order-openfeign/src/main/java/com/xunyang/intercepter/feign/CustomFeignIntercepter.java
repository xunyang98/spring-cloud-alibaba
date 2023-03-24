package com.xunyang.intercepter.feign;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomFeignIntercepter implements RequestInterceptor {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.uri("/9");
        logger.info("feign拦截器！");
    }
}
