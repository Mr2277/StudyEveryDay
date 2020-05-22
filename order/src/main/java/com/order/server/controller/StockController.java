package com.order.server.controller;

import com.order.server.entity.Stock;
import com.order.server.service.StockService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (Stock)表控制层
 *
 * @author makejava
 * @since 2020-05-21 21:44:59
 */
@RestController
@RequestMapping("stock")
public class StockController {
    /**
     * 服务对象
     */
    @Autowired
    private StockService stockService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Stock selectOne(Integer id) {

        return this.stockService.queryById(id);
    }

}