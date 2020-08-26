package com.qinjb.spring.cloud.netflix.web.admin.feign.service.fallback;

import com.qinjb.spring.cloud.netflix.web.admin.feign.service.WebAdminFeignService;
import org.springframework.stereotype.Component;

@Component
public class WebAdminFeignFallBack implements WebAdminFeignService {
    @Override
    public String getPort() {
        return "getPort 方法出现错误（feign），服务熔断！";
    }

    @Override
    public String test(String string) {
        return "test 方法出现错误（feign），服务熔断！" + string;
    }
}
