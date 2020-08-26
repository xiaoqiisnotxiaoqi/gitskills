package com.qinjb.spring.cloud.netflix.web.admin.feign.service;

import com.qinjb.spring.cloud.netflix.web.admin.feign.service.fallback.WebAdminFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SPRING-CLOUD-NETFLIX-SERVICE-ADMIN",fallback = WebAdminFeignFallBack.class)
public interface  WebAdminFeignService {

    @RequestMapping(value = "/getPort",method = RequestMethod.GET)
    String getPort();

    @RequestMapping(value = "/test/{string}" ,method = RequestMethod.GET)
    String test(@PathVariable("string") String string);
}
