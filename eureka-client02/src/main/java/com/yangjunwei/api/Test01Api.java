package com.yangjunwei.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者: LCG
 * 日期: 2019/11/29 11:43
 * 描述:
 */

@FeignClient(name = "EUREKAE-CLIENT01",url = "http://localhost:8083")
public interface Test01Api {

    @RequestMapping("test01")
    public String test01();

}
