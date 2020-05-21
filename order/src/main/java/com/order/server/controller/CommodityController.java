package com.order.server.controller;

import com.order.server.entity.Commodity;
import com.order.server.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Commodity)表控制层
 *
 * @author makejava
 * @since 2020-05-20 18:09:31
 */
@RestController
@RequestMapping("commodity")
public class CommodityController {
    /**
     * 服务对象
     */
    //@Resource
    @Autowired
    private CommodityService commodityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Commodity selectOne(Integer id) {
        System.out.println("selectOne");
        System.out.println(commodityService.queryById(id).getId());
        System.out.println(commodityService.queryById(id).getName());
        System.out.println(commodityService.queryById(id).getPrice());

        return this.commodityService.queryById(id);
    }

}