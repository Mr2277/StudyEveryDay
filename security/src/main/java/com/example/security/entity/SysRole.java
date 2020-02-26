package com.example.security.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 角色表(SysRole)实体类
 *
 * @author makejava
 * @since 2020-02-25 23:18:14
 */
@Component
public class SysRole implements Serializable {
    private static final long serialVersionUID = -10001344882225369L;
    /**
    * 角色ID
    */
    private Long roleId;
    /**
    * 角色名称
    */
    private String roleName;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}