package com.huawei.scheduled.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sche")
public class ScheduleController {
    @RequestMapping("/test")
    public void test() {
        System.out.println("test");
    }
}
