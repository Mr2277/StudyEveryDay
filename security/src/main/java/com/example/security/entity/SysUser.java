package com.example.security.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 系统用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2020-02-25 22:59:44
 */
@Component
public class SysUser implements Serializable {
    private static final long serialVersionUID = 551161699459185698L;
    /**
    * 用户ID
    */
    private Long userId;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 状态 PROHIBIT：禁用   NORMAL：正常
    */
    private String status;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}