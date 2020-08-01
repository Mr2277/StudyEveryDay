package com.example.consumer.controller;

import com.example.consumer.entity.Rocketmessage;
import com.example.consumer.service.RocketmessageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (Rocketmessage)表控制层
 *
 * @author makejava
 * @since 2020-08-01 12:43:10
 */
@RestController
@RequestMapping("/rocketmessage")
public class RocketmessageController {
    /**
     * 服务对象
     */
    @Autowired
    private RocketmessageService rocketmessageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Rocketmessage selectOne(Integer id) {
        return this.rocketmessageService.queryById(id);
    }

    @RequestMapping("/test")
    public void test() {

    }

}