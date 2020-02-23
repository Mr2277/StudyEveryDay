package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(value="用户controller",description="用户操作",tags={"用户操作接口"})
public class HelloContrller {
    @ApiOperation(value = "接口的功能介绍",notes = "提示接口使用者注意事项",httpMethod = "GET")

    @RequestMapping("/hello")
    public Integer hello(){
        int a=4;
        int b=4;
        a++;
        a++;
        a++;
        int c=a+b;
        return c;
    }
}
