package com.test.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Api(description = "用户相关接口文档")

public class HelloController {
    @GetMapping("/test")
    @ApiOperation(value = "用户首页",notes = "访问页面")

    public String test(){
        return "test";
    }
}
