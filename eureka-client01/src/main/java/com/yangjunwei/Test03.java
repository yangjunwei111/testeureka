package com.yangjunwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Test03 {
    public static void main(String[] args) {
        SpringApplication.run(Test03.class,args);
    }
}
