package com.huawei.scheduled.controller;

import com.huawei.scheduled.entity.BtSche;
import com.huawei.scheduled.service.BtScheService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (BtSche)表控制层
 *
 * @author makejava
 * @since 2020-07-26 13:40:16
 */
@RestController
@RequestMapping("btSche")
public class BtScheController {
    /**
     * 服务对象
     */
    @Autowired
    private BtScheService btScheService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BtSche selectOne(Integer id) {
        return this.btScheService.queryById(id);
    }

}