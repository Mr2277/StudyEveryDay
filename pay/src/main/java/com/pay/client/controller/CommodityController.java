package com.pay.client.controller;

import com.pay.client.entity.Commodity;
import com.pay.client.entity.Sheet;
import com.pay.client.service.CommodityService;
import com.pay.client.service.SheetService;
import com.pay.client.service.StockService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * (Commodity)表控制层
 *
 * @author makejava
 * @since 2020-05-21 20:37:29
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController {
    /**
     * 服务对象
     */
    @Autowired
    private CommodityService commodityService;

    @Autowired
    private StockService stockService;

    @Autowired
    private SheetService sheetService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Commodity selectOne(Integer id) {
        return this.commodityService.queryById(id);
    }

    @RequestMapping("/updateNum")
    public int updateNum(Integer id) {
        stockService.update(id);
        Sheet sheet = new Sheet();
        sheet.setName("iphone");
        sheet.getCreateTime(new Date());
        sheetService.insert(sheet);
        return 0;
    }



}