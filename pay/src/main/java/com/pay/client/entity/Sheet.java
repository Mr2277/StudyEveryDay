package com.pay.client.entity;

import java.util.Date;
import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * (Sheet)实体类
 *
 * @author makejava
 * @since 2020-08-02 17:34:21
 */
@Component
public class Sheet implements Serializable {
    private static final long serialVersionUID = 502154368867452880L;
    
    private Integer id;
    
    private String name;
    
    private Date createTime;


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

    public Date getCreateTime(Date date) {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}