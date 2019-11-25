package com.jxy.pmp.model.mapper;

import com.jxy.pmp.model.entity.ItemType;

public interface ItemTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(ItemType record);

    int insertSelective(ItemType record);

    ItemType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(ItemType record);

    int updateByPrimaryKey(ItemType record);
}