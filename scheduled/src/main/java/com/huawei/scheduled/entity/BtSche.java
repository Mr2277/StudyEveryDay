package com.huawei.scheduled.entity;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * (BtSche)实体类
 *
 * @author makejava
 * @since 2020-07-26 13:41:41
 */
@Component
public class BtSche implements Serializable {
    private static final long serialVersionUID = -82039851110973912L;
    
    private Integer id;
    
    private String nextRunTime;
    
    private String uuid;


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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}