package com.huawei.scheduled.service.impl;

import com.huawei.scheduled.entity.BtHis;
import com.huawei.scheduled.dao.BtHisDao;
import com.huawei.scheduled.service.BtHisService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * (BtHis)表服务实现类
 *
 * @author makejava
 * @since 2020-07-26 14:16:33
 */
@Service("btHisService")
public class BtHisServiceImpl implements BtHisService {
    @Autowired
    private BtHisDao btHisDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BtHis queryById(Integer id) {
        return this.btHisDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BtHis> queryAllByLimit(int offset, int limit) {
        return this.btHisDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param btHis 实例对象
     * @return 实例对象
     */
    @Override
    public BtHis insert(BtHis btHis) {
        this.btHisDao.insert(btHis);
        return btHis;
    }

    /**
     * 修改数据
     *
     * @param btHis 实例对象
     * @return 实例对象
     */
    @Override
    public BtHis update(BtHis btHis) {
        this.btHisDao.update(btHis);
        return this.queryById(btHis.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.btHisDao.deleteById(id) > 0;
    }
}