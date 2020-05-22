package com.order.server.service.impl;

import com.order.server.entity.Stock;
import com.order.server.service.OrderService;
import com.order.server.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private StockService stockService;
    @Override
    public boolean order() throws Exception {

        Stock stock=stockService.queryById(1);
        //stock.setNum(stock.getNum()-1);
        //stockService.update(stock);
       // */
        stockService.order(stock);
        return false;
    }
}
