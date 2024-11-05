package com.etergg;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JoinService {

    JoinDto dto;
    JoinDao dao;

    public List<JoinDto> selectList(JoinDto dto){
        return dao.join(dto);
    }

    public void join(JoinDto dto) {
    }
}
