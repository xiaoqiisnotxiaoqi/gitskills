package com.qinjb.spring.cloud.netflix.web.admin.feign.controller;


import com.qinjb.spring.cloud.netflix.web.admin.feign.service.WebAdminFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAdminFeignController {

    @Autowired
    private WebAdminFeignService webAdminFeignService;


    @RequestMapping(value = "/getPort",method = RequestMethod.GET)
    String getPort() {
       return webAdminFeignService.getPort();
    }

    @RequestMapping(value = "/test/{string}" ,method = RequestMethod.GET)
    String test(@PathVariable("string") String string) {
        return webAdminFeignService.test(string);
    }




}
