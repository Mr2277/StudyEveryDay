package com.example.consumer.service;

import com.example.consumer.entity.Rocketmessage;
import java.util.List;

/**
 * (Rocketmessage)表服务接口
 *
 * @author makejava
 * @since 2020-08-01 12:43:08
 */
public interface RocketmessageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Rocketmessage queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Rocketmessage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rocketmessage 实例对象
     * @return 实例对象
     */
    Rocketmessage insert(Rocketmessage rocketmessage);

    /**
     * 修改数据
     *
     * @param rocketmessage 实例对象
     * @return 实例对象
     */
    Rocketmessage update(Rocketmessage rocketmessage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}