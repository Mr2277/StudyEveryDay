package com.example.consumer.dao;

import com.example.consumer.entity.Rocketmessage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * (Rocketmessage)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-01 12:43:04
 */
@Repository
public interface RocketmessageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Rocketmessage queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Rocketmessage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param rocketmessage 实例对象
     * @return 对象列表
     */
    List<Rocketmessage> queryAll(Rocketmessage rocketmessage);

    /**
     * 新增数据
     *
     * @param rocketmessage 实例对象
     * @return 影响行数
     */
    int insert(Rocketmessage rocketmessage);

    /**
     * 修改数据
     *
     * @param rocketmessage 实例对象
     * @return 影响行数
     */
    int update(Rocketmessage rocketmessage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}