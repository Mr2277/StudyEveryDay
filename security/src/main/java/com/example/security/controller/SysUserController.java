package com.example.security.controller;

import com.example.security.common.UserAuthenticationProvider;
import com.example.security.entity.SysUser;
import com.example.security.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * 系统用户表(SysUser)表控制层
 *
 * @author makejava
 * @since 2020-02-25 23:00:38
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SysUser selectOne(Long id) {
        return this.sysUserService.queryById(id);
    }


}