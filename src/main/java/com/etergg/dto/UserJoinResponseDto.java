package com.etergg.dto;

import com.etergg.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserJoinResponseDto {

    private Long id;

    private String userNickname;

    private String userRank;
    private String userMost1;
    private String userMost2;
    private String userMost3;

    private String joinCategory;
    private String joinMessage;
    private String delYn;
    private LocalDateTime createDate;

    private UserJoinResponseDto userRepository;

    public UserJoinResponseDto(User userJoin) {
        this.id = userJoin.getId();
        this.userNickname = userJoin.getUserNickname();
        this.userRank = userJoin.getUserRank();
        this.userMost1 = userJoin.getUserMost1();
        this.userMost2 = userJoin.getUserMost2();
        this.userMost3 = userJoin.getUserMost3();
        this.joinCategory = userJoin.getJoinCategory();
        this.joinMessage = userJoin.getJoinMessage();
        this.delYn = userJoin.getDelYn();
        this.createDate = userJoin.getCreateDate();
    }

}
