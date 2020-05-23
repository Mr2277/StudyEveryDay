package com.order.server.entity;

import java.util.Date;
import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * (Sheet)实体类
 *
 * @author makejava
 * @since 2020-05-22 20:34:53
 */
@Component
public class Sheet implements Serializable {
    private static final long serialVersionUID = -44359114669059231L;
    
    private Integer id;
    
    private String name;
    
    private String createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}