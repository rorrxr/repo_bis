package com.etergg;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JoinDao {

    List<JoinDto> join(JoinDto dto);  // 구인 목록 조회

    void insert(JoinDto dto);  // 구인 등록

    List<JoinDto> user(JoinDto dto);   // 유저 정보 조회
}
