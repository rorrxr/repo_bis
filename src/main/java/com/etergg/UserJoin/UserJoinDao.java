package com.etergg.UserJoin;

import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface UserJoinDao {
    void insert(UserJoin userJoin) throws SQLException; // Exception Handling
}
