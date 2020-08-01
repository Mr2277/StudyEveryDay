package com.example.consumer.entity;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * (Rocketmessage)实体类
 *
 * @author makejava
 * @since 2020-08-01 12:43:04
 */
@Component
public class Rocketmessage implements Serializable {
    private static final long serialVersionUID = -51559223730053091L;
    
    private Integer id;
    
    private String topic;
    
    private String tags;
    
    private String keys;
    
    private String msg;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}