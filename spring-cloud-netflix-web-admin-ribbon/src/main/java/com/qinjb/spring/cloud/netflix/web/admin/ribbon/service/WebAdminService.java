package com.qinjb.spring.cloud.netflix.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebAdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    public String test(String string) {
        return restTemplate.getForObject("http://SPRING-CLOUD-NETFLIX-SERVICE-ADMIN/test?string=" + string, String.class);
    }


    @HystrixCommand(fallbackMethod = "getPortError")
    public String getPort(){
        return restTemplate.getForObject("http://SPRING-CLOUD-NETFLIX-SERVICE-ADMIN/getPort",String.class);
    }

    public String testError(String string){
        return "test 方法出现错误(ribbon)，服务降级！" + string;
    }

    public String getPortError(){
        return "getPort 方法出现错误(ribbon)，服务降级！ ";
    }

}
