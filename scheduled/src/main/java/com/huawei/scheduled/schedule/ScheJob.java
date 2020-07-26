package com.huawei.scheduled.schedule;

import com.huawei.scheduled.aop.annotate.FirstAspect;
import com.huawei.scheduled.dao.BtHisDao;
import com.huawei.scheduled.entity.BtHis;
import com.huawei.scheduled.utils.DateUtis;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@FirstAspect
public class ScheJob {

    @Resource
    private BtHisDao btHisDao;
    @Scheduled(cron = "0 0/1 * * * ?")
    public void sync1() {

        System.out.println("1");
    }

    @Scheduled(cron = "0 0/1 * * * ?")
    public void sync2() throws InterruptedException {
        System.out.println("2");
    }
}
