package com.etergg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JoinService {

    @Autowired
    private JoinDao dao;

    // 구인 등록을 위한 메서드
    public void insert(JoinDto dto) {
        dao.insert(dto);  // DB에 구인 등록
    }

    // 구인 목록 조회
//    public List<JoinDto> selectList(JoinDto dto) {
//        return dao.join(dto);
//    }
}
