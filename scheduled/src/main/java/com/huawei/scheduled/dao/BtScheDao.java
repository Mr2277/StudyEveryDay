package com.huawei.scheduled.dao;

import com.huawei.scheduled.entity.BtSche;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * (BtSche)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 13:41:47
 */
@Repository
public interface BtScheDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BtSche queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BtSche> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param btSche 实例对象
     * @return 对象列表
     */
    List<BtSche> queryAll(BtSche btSche);

    /**
     * 新增数据
     *
     * @param btSche 实例对象
     * @return 影响行数
     */
    int insert(BtSche btSche);

    /**
     * 修改数据
     *
     * @param btSche 实例对象
     * @return 影响行数
     */
    int update(BtSche btSche);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    int updateUuidById(@Param("id") Integer id,
                       @Param("uuid") String uuid);

    String selectUuidById(Integer id);

    int updateSetUuidIsNull(Integer id);

    int updateSetNextRunTime(Integer id,String nextRunTime);

    String selectNextRunTimeById(Integer id);

}