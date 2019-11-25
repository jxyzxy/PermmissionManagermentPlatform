package com.jxy.pmp.model.mapper;

import com.jxy.pmp.model.entity.SysUserPost;

public interface SysUserPostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserPost record);

    int insertSelective(SysUserPost record);

    SysUserPost selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserPost record);

    int updateByPrimaryKey(SysUserPost record);
}