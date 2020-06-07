package com.order.server.service.impl;

import com.order.server.entity.Commodity;
import com.order.server.entity.Sheet;
import com.order.server.entity.Stock;
import com.order.server.service.CommodityService;
import com.order.server.service.OrderService;
import com.order.server.service.SheetService;
import com.order.server.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private StockService stockService;
    @Autowired
    private SheetService sheetService;
    @Autowired
    private CommodityService commodityService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    private static boolean flag=false;
    private int count=0;
    @Override
    public  boolean order() throws Exception {
        if(stringRedisTemplate.hasKey("1")){

            //stringRedisTemplate.opsForValue().decrement("1");
            /*
            Sheet sheet= (Sheet) redisTemplate.boundHashOps("sheet").get(1);
            System.out.println(sheet.getCreateTime()+"#"+sheet.getName()+"#"+sheet.getId());
             */
            /*
            Sheet sheet=new Sheet();
            Commodity commodity= (Commodity) redisTemplate.boundHashOps("commodity").get(1);
            sheet.setId(commodity.getId());
            sheet.setName(commodity.getName());
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //从前端或者自己模拟一个日期格式，转为String即可
            String dateStr = format.format(date);
            sheet.setCreateTime(dateStr);
            //redisTemplate.boundHashOps("sheet").put(stringRedisTemplate.opsForValue().get("auto_increment"),sheet);
            redisTemplate.boundListOps("sheet").leftPush(sheet);
            stringRedisTemplate.boundValueOps("auto_increment").increment();
            */

            //Set set=redisTemplate.boundHashOps("sheet").keys();
            //System.out.println(set.size());
            Long length = redisTemplate.boundListOps("sheet").size();
            for(int i=0;i<length;i++){
                Sheet sheet= (Sheet) redisTemplate.boundListOps("sheet").index(i);
                System.out.println(sheet.getCreateTime()+"#"+sheet.getName()+"#"+sheet.getId());

            }
            /*
            Iterator iterator=set.iterator();
            while(iterator.hasNext()){
                Object str=iterator.next();
                Sheet sheet= (Sheet) redisTemplate.boundHashOps("sheet").get(str);
                System.out.println(sheet.getCreateTime()+"#"+sheet.getName()+"#"+sheet.getId());

                //System.out.println(str);
            }
            */

        }
        else{
            Stock stock=stockService.queryById(1);
            stringRedisTemplate.opsForValue().set(String.valueOf(stock.getId()),String.valueOf(stock.getNum()-1));
            Commodity commodity=commodityService.queryById(stock.getId());
            redisTemplate.boundHashOps("commodity").put(commodity.getId(),commodity);
            stringRedisTemplate.opsForValue().set("auto_increment","1");

            Sheet sheet=new Sheet();
            sheet.setId(commodity.getId());
            sheet.setName(commodity.getName());
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //从前端或者自己模拟一个日期格式，转为String即可
            String dateStr = format.format(date);
            sheet.setCreateTime(dateStr);
            //redisTemplate.boundHashOps("sheet").put(1,sheet);
            redisTemplate.boundListOps("sheet").leftPush(sheet);
            stringRedisTemplate.boundValueOps("auto_increment").increment();
        }
        //stringRedisTemplate.opsForValue().set(String.valueOf(stock.getId()),String.valueOf(count));
        //System.out.println(redisTemplate.opsForValue().get("1").toString());
       // redisTemplate.opsForValue().decrement("1");
        //System.out.println(redisTemplate.opsForValue().get("1").toString());
        //if(stockService.update(stock)){


            //  sheetService.insert(sheet);

        //}
       // */
        return false;

    }
}
