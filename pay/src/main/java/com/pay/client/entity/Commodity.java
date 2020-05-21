package com.pay.client.entity;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * (Commodity)实体类
 *
 * @author makejava
 * @since 2020-05-21 20:37:29
 */
@Component
public class Commodity implements Serializable {
    private static final long serialVersionUID = 981310165037620012L;
    
    private Integer id;
    
    private String name;
    
    private Double price;


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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}