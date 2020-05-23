package com.order.server.service.impl;

import com.order.server.entity.Stock;
import com.order.server.dao.StockDao;
import com.order.server.service.StockService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

/**
 * (Stock)表服务实现类
 *
 * @author makejava
 * @since 2020-05-21 21:44:59
 */
@Service("stockService")
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDao stockDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Stock queryById(Integer id) {
        //Stock stock=stockDao.queryById(id);
        try {
           // order(stock);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.stockDao.queryById(id);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    public Stock queryById(Stock stock) {
        return this.stockDao.queryById(stock.getId());
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Stock> queryAllByLimit(int offset, int limit) {
        return this.stockDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    @Override
    public Stock insert(Stock stock) {
        this.stockDao.insert(stock);
        return stock;
    }

    /**
     * 修改数据
     *
     * @param stock 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean update(Stock stock) {
           this.stockDao.update(stock);
           // TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//如果updata2()抛了异常,updata()会回滚,不影响事物正常执行

        if(stock.getNum().equals(queryById(stock).getNum())){
            //throw new RuntimeException("扣减库存异常");
            return true;
        }
        else{
            throw new RuntimeException("扣减库存异常");
        }

    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.stockDao.deleteById(id) > 0;
    }


}