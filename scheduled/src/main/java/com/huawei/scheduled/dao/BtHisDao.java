package com.huawei.scheduled.dao;

import com.huawei.scheduled.entity.BtHis;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * (BtHis)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 14:16:33
 */
@Repository
public interface BtHisDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BtHis queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BtHis> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param btHis 实例对象
     * @return 对象列表
     */
    List<BtHis> queryAll(BtHis btHis);

    /**
     * 新增数据
     *
     * @param btHis 实例对象
     * @return 影响行数
     */
    int insert(BtHis btHis);

    /**
     * 修改数据
     *
     * @param btHis 实例对象
     * @return 影响行数
     */
    int update(BtHis btHis);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}