package com.order.server.controller;

import com.order.server.entity.Sheet;
import com.order.server.service.SheetService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (Sheet)表控制层
 *
 * @author makejava
 * @since 2020-05-22 16:00:22
 */
@RestController
@RequestMapping("sheet")
public class SheetController {
    /**
     * 服务对象
     */
    @Autowired
    private SheetService sheetService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Sheet selectOne(Integer id) {
        return this.sheetService.queryById(id);
    }

}