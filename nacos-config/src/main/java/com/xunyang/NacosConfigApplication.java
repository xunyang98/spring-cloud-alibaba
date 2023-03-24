package com.xunyang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import sun.security.action.GetPropertyAction;

import java.text.Format;

@SpringBootApplication
//@RefreshScope
public class NacosConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(NacosConfigApplication.class, args);
        String name1 = context.getEnvironment().getProperty("user.name1");
        System.out.println(name1);

//        String name = context.getEnvironment().getProperty("user.name");
//        String age = context.getEnvironment().getProperty("user.age");
//        String sex = context.getEnvironment().getProperty("user.sex");
//        System.out.println(name + age + sex);


        // Test mutiple profile
//        String one = context.getEnvironment().getProperty("kuangbiao.one");
//        String two = context.getEnvironment().getProperty("kuangbiao.two");
//        String three = context.getEnvironment().getProperty("kuangbiao.three");
//        String four = context.getEnvironment().getProperty("kuangbiao.four");
//
//        System.out.println(one + " " + two + " " + three + " " + four);



//        SpringApplication.run(NacosConfigApplication.class, args);

    }
}
