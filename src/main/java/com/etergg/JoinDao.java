package com.etergg;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JoinDao {
    public void insert(JoinDto dto);
}
