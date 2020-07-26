package com.huawei.scheduled.service;

import com.huawei.scheduled.entity.BtHis;
import java.util.List;

/**
 * (BtHis)表服务接口
 *
 * @author makejava
 * @since 2020-07-26 14:16:33
 */
public interface BtHisService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BtHis queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BtHis> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param btHis 实例对象
     * @return 实例对象
     */
    BtHis insert(BtHis btHis);

    /**
     * 修改数据
     *
     * @param btHis 实例对象
     * @return 实例对象
     */
    BtHis update(BtHis btHis);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}