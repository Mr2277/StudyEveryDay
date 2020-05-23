package com.order.server.service.impl;

import com.order.server.dao.SheetDao;
import com.order.server.entity.Sheet;
import com.order.server.service.SheetService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * (Sheet)表服务实现类
 *
 * @author makejava
 * @since 2020-05-22 16:00:22
 */
@Service("sheetService")
public class SheetServiceImpl implements SheetService {
    @Autowired
    private SheetDao sheetDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Sheet queryById(Integer id) {
        return this.sheetDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Sheet> queryAllByLimit(int offset, int limit) {
        return this.sheetDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sheet 实例对象
     * @return 实例对象
     */
    @Override
    public Sheet insert(Sheet sheet) {
        this.sheetDao.insert(sheet);
        return sheet;
    }

    /**
     * 修改数据
     *
     * @param sheet 实例对象
     * @return 实例对象
     */
    @Override
    public Sheet update(Sheet sheet) {
        this.sheetDao.update(sheet);
        return this.queryById(sheet.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sheetDao.deleteById(id) > 0;
    }
}