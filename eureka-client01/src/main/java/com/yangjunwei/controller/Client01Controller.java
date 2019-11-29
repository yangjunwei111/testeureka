package com.yangjunwei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client01Controller {
    @RequestMapping("test01")
    public String testClient01(){
        System.out.println("=================test==================");
        return "testClient01";
    }
}
