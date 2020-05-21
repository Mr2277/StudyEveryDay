package com.pay.client.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Stock)实体类
 *
 * @author makejava
 * @since 2020-05-21 17:26:33
 */
@Component
public class Stock implements Serializable {
    private static final long serialVersionUID = 689800223930123738L;
    
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