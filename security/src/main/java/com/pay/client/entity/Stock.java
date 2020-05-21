package com.pay.client.entity;

import java.io.Serializable;

/**
 * (Stock)实体类
 *
 * @author makejava
 * @since 2020-05-21 17:21:29
 */
public class Stock implements Serializable {
    private static final long serialVersionUID = -10597924296895979L;
    
    private Integer id;
    
    private Integer num;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}