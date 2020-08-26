package com.qinjb.spring.cloud.netflix.web.admin.ribbon.controller;

import com.qinjb.spring.cloud.netflix.web.admin.ribbon.service.WebAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
public class WebAdminController {

    @Autowired
    private WebAdminService webAdminService;

    @RequestMapping(value = "/test/{string}", method = RequestMethod.GET)
    public String test(@PathVariable String string) {
        return webAdminService.test(string);
    }

    @RequestMapping(value = "/getPort")
    public String getPort(){
        return webAdminService.getPort();
    }

}
