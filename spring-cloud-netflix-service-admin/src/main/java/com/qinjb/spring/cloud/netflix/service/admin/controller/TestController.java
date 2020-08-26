package com.qinjb.spring.cloud.netflix.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;


    @RequestMapping(value = "/getPort",method = RequestMethod.GET)
    public String getPort() {
        return "当前服务端口为" + port;
    }


    @RequestMapping(value = "/test/{string}",method = RequestMethod.GET)
    public String test(@PathVariable("string") String string){
        return "test" + string;
    }

}
