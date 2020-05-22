package com.order.server.controller;

import com.order.server.feign.PayFeign;
import com.order.server.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private PayFeign payFeign;
    @Autowired
    private OrderService orderService;
    @RequestMapping(value="/test")
    public String test(){
        //String str = restTemplate.getForObject("http://PAY/test",String.class);
        String str=payFeign.testFeign();
        System.out.println(str+"##############");
        return "order";
    }
    @RequestMapping("/order")
    public String order() throws Exception {
        orderService.order();
        return "order";
    }
}
