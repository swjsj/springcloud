package com.swjsj.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sily on 2017/10/18.
 */
@Configuration
@EnableAutoConfiguration
@RestController
public class Application {

//    @Value("${emailCode}")
//    String zrs = "test";
//    @RequestMapping("/emailCode")
//    public String emailCode() {
//        return zrs;
//    }

    @Value("${ITOSSBeijing.bucketName}")
    String yml = "";

    @RequestMapping("/yml")
    public String yml() {
        return yml;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}