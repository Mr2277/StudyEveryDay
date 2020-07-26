package com.huawei.scheduled.service.impl;

import com.huawei.scheduled.entity.BtSche;
import com.huawei.scheduled.dao.BtScheDao;
import com.huawei.scheduled.service.BtScheService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BtSche)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 13:41:53
 */
@Service("btScheService")
public class BtScheServiceImpl implements BtScheService {
    @Resource
    private BtScheDao btScheDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BtSche queryById(Integer id) {
        return this.btScheDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BtSche> queryAllByLimit(int offset, int limit) {
        return this.btScheDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param btSche 实例对象
     * @return 实例对象
     */
    @Override
    public BtSche insert(BtSche btSche) {
        this.btScheDao.insert(btSche);
        return btSche;
    }

    /**
     * 修改数据
     *
     * @param btSche 实例对象
     * @return 实例对象
     */
    @Override
    public BtSche update(BtSche btSche) {
        this.btScheDao.update(btSche);
        return this.queryById(btSche.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.btScheDao.deleteById(id) > 0;
    }
}