package com.example.security.controller;

import com.example.security.entity.SysUserRole;
import com.example.security.service.SysUserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户与角色关系表(SysUserRole)表控制层
 *
 * @author makejava
 * @since 2020-02-25 23:19:10
 */
@RestController
@RequestMapping("sysUserRole")
public class SysUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserRoleService sysUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserRole selectOne(Long id) {
        return this.sysUserRoleService.queryById(id);
    }

}