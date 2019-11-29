package com.yangjunwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class test02Server {
    public static void main(String[] args) {
        SpringApplication.run(test02Server.class,args);
    }
}
