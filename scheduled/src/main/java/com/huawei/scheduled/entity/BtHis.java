package com.huawei.scheduled.entity;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * (BtHis)实体类
 *
 * @author makejava
 * @since 2020-07-26 14:16:33
 */
@Component
public class BtHis implements Serializable {
    private static final long serialVersionUID = 409874755558119513L;
    
    private Integer id;
    
    private String nextRunTime;
    
    private String method;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNextRunTime() {
        return nextRunTime;
    }

    public void setNextRunTime(String nextRunTime) {
        this.nextRunTime = nextRunTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

}