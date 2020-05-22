package com.order.server.entity;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * (Stock)实体类
 *
 * @author makejava
 * @since 2020-05-21 21:44:59
 */
@Component
public class Stock implements Serializable {
    private static final long serialVersionUID = -19095133777362145L;
    
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