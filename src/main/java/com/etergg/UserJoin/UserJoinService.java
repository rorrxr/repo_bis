package com.etergg.UserJoin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@RequiredArgsConstructor
public class UserJoinService {
    // @RequiredArgsConstructor를 사용하는 경우
    private final UserJoinDao userJoinDao;         // 일반적으로 보안상의 이유로 private을 권장

    // 구인 등록을 위한 메서드
    // Controller에서 접근해야 하므로 여기는 public
    public Long insert(UserJoinDto requestDto) {
        UserJoin entity = requestDto.toEntity();
        try {
            userJoinDao.insert(entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return entity.getId();
    }


    // @RequiredArgsConstructor를 사용하지 않는 경우
    // @Autowired
    // private JoinDao dao;                     // 일반적으로 보안상의 이유로 private을 권장

    // 구인 등록을 위한 메서드
    // Controller에서 접근해야 하므로 여기는 public
//    public void insert(JoinDto dto) {
//        dao.insert(dto);  // DB에 구인 등록
//    }

    // 구인 목록 조회
//    public List<JoinDto> selectList(JoinDto dto) {
//        return dao.join(dto);
//    }
}

