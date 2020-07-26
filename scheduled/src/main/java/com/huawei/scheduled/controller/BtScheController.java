package com.huawei.scheduled.controller;

import com.huawei.scheduled.entity.BtSche;
import com.huawei.scheduled.service.BtScheService;
import com.huawei.scheduled.utils.DateUtis;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (BtSche)表控制层
 *
 * @author makejava
 * @since 2020-07-26 13:41:54
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
    @GetMapping("/selectOne")
    public BtSche selectOne(Integer id) {
        return this.btScheService.queryById(id);
    }

    @GetMapping("/insert")
    public void insertOne() {
        BtSche btSche = new BtSche();
        btSche.setNextRunTime(DateUtis.getDateTime());
        btScheService.insert(btSche);
        //return btScheService.insert();
    }

}