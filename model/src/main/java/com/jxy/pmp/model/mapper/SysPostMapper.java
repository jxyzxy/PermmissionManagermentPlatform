package com.jxy.pmp.model.mapper;

import com.jxy.pmp.model.entity.SysPost;

public interface SysPostMapper {
    int deleteByPrimaryKey(Long postId);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    SysPost selectByPrimaryKey(Long postId);

    int updateByPrimaryKeySelective(SysPost record);

    int updateByPrimaryKey(SysPost record);
}