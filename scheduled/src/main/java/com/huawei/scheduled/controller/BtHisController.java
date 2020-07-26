package com.huawei.scheduled.controller;

import com.huawei.scheduled.entity.BtHis;
import com.huawei.scheduled.service.BtHisService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (BtHis)表控制层
 *
 * @author makejava
 * @since 2020-07-26 14:16:33
 */
@RestController
@RequestMapping("btHis")
public class BtHisController {
    /**
     * 服务对象
     */
    @Autowired
    private BtHisService btHisService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BtHis selectOne(Integer id) {
        return this.btHisService.queryById(id);
    }

}