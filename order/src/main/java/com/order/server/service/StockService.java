package com.order.server.service;

import com.order.server.entity.Stock;
import java.util.List;

/**
 * (Stock)表服务接口
 *
 * @author makejava
 * @since 2020-05-21 21:44:59
 */
public interface StockService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Stock queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Stock> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    Stock insert(Stock stock);

    /**
     * 修改数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    boolean update(Stock stock);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    public boolean order  (Stock stock) throws Exception;
}