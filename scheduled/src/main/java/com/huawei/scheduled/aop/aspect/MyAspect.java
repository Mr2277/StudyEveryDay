package com.huawei.scheduled.aop.aspect;

import com.huawei.scheduled.dao.BtHisDao;
import com.huawei.scheduled.dao.BtScheDao;
import com.huawei.scheduled.entity.BtHis;
import com.huawei.scheduled.utils.DateUtis;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Aspect
@Component
public class MyAspect {

    @Autowired
    private BtScheDao btScheDao;

    @Autowired
    private BtHisDao btHisDao;
    private final static int id = 1;

    @Around("@within(com.huawei.scheduled.aop.annotate.FirstAspect)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        String nextRunTime =  DateUtis.getDateTime(new Date().getTime() + 1 * 60 * 1000);
        System.out.println(nextRunTime);
        String uuid = UUID.randomUUID().toString();
        //String nextRunTime = btScheDao.selectNextRunTimeById(id);
        btScheDao.updateUuidById(id,uuid);
        String uuidFromMysql = btScheDao.selectUuidById(id);
        Object result = null;
        if (uuidFromMysql != null && uuid.equals(uuidFromMysql)) {
            String currentTime = DateUtis.getDateTime();
            String nextRunTimeMysql = btScheDao.selectNextRunTimeById(id);
            if (nextRunTimeMysql != null && currentTime.compareTo(nextRunTimeMysql)>=0) {
                btScheDao.updateSetNextRunTime(id,nextRunTime);
                BtHis btHis = new BtHis();
                btHis.setNextRunTime(currentTime);
                // 获取目标方法的名称
                String methodName = pjp.getSignature().getName();
                btHis.setMethod(methodName+"#"+uuid);
                btHisDao.insert(btHis);
                result = pjp.proceed();
                System.out.println("this is after around advice");
            }
            btScheDao.updateSetUuidIsNull(id);
        }
        return result;
    }
}
