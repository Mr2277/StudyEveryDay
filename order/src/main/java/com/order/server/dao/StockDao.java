package com.order.server.dao;

import com.order.server.entity.Stock;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * (Stock)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-21 21:44:59
 */
@Repository
public interface StockDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Stock queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Stock> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stock 实例对象
     * @return 对象列表
     */
    List<Stock> queryAll(Stock stock);

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 影响行数
     */
    int insert(Stock stock);

    /**
     * 修改数据
     *
     * @param stock 实例对象
     * @return 影响行数
     */
    int update(Stock stock);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}