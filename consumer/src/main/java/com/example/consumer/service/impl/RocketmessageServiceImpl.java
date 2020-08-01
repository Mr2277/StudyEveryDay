package com.example.consumer.service.impl;

import com.example.consumer.entity.Rocketmessage;
import com.example.consumer.dao.RocketmessageDao;
import com.example.consumer.service.RocketmessageService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * (Rocketmessage)表服务实现类
 *
 * @author makejava
 * @since 2020-08-01 12:43:09
 */
@Service("rocketmessageService")
public class RocketmessageServiceImpl implements RocketmessageService {
    @Autowired
    private RocketmessageDao rocketmessageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Rocketmessage queryById(Integer id) {
        return this.rocketmessageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Rocketmessage> queryAllByLimit(int offset, int limit) {
        return this.rocketmessageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rocketmessage 实例对象
     * @return 实例对象
     */
    @Override
    public Rocketmessage insert(Rocketmessage rocketmessage) {
        this.rocketmessageDao.insert(rocketmessage);
        return rocketmessage;
    }

    /**
     * 修改数据
     *
     * @param rocketmessage 实例对象
     * @return 实例对象
     */
    @Override
    public Rocketmessage update(Rocketmessage rocketmessage) {
        this.rocketmessageDao.update(rocketmessage);
        return this.queryById(rocketmessage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.rocketmessageDao.deleteById(id) > 0;
    }
}