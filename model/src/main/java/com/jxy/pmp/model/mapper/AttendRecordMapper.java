package com.jxy.pmp.model.mapper;

import com.jxy.pmp.model.entity.AttendRecord;

public interface AttendRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AttendRecord record);

    int insertSelective(AttendRecord record);

    AttendRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AttendRecord record);

    int updateByPrimaryKey(AttendRecord record);
}