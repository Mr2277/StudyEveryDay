package com.order.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "pay")
public interface PayFeign {
    @PostMapping("/test/")
    String testFeign();
}
