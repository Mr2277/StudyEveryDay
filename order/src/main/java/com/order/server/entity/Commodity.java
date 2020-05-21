package com.order.server.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Commodity)实体类
 *
 * @author makejava
 * @since 2020-05-20 18:09:27
 */
@Component
public class Commodity implements Serializable {
    private static final long serialVersionUID = 554132623298348495L;
    
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