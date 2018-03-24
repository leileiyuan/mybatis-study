package com.yuanleilei.mybatis.mapper;

import com.yuanleilei.mybatis.model.SysUser;

public interface UserMapper {
    public SysUser findById(Integer id);

    public Long save(SysUser sysUser);
}
