package com.pay.client.dao;

import com.pay.client.entity.Sheet;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * (Sheet)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-02 17:34:21
 */
@Repository
public interface SheetDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Sheet queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sheet> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sheet 实例对象
     * @return 对象列表
     */
    List<Sheet> queryAll(Sheet sheet);

    /**
     * 新增数据
     *
     * @param sheet 实例对象
     * @return 影响行数
     */
    int insert(Sheet sheet);

    /**
     * 修改数据
     *
     * @param sheet 实例对象
     * @return 影响行数
     */
    int update(Sheet sheet);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}