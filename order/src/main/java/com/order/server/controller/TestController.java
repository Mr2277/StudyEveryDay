package com.order.server.controller;

import com.order.server.feign.PayFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private PayFeign payFeign;
    @RequestMapping(value="/test")
    public String test(){
        //String str = restTemplate.getForObject("http://PAY/test",String.class);
        String str=payFeign.testFeign();
        System.out.println(str+"##############");
        return "order";
    }
}
