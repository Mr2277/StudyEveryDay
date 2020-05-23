package com.order.server.service;

import com.order.server.entity.Sheet;

import java.util.List;

/**
 * (Sheet)表服务接口
 *
 * @author makejava
 * @since 2020-05-22 16:00:22
 */
public interface SheetService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Sheet queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sheet> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sheet 实例对象
     * @return 实例对象
     */
    Sheet insert(Sheet sheet);

    /**
     * 修改数据
     *
     * @param sheet 实例对象
     * @return 实例对象
     */
    Sheet update(Sheet sheet);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}