package com.etergg.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserJoinRequestDto {
    private Long id;

    private String userNickname;

    private Integer userRank;
    private String userMost1;
    private String userMost2;
    private String userMost3;

    private Integer joinCategory;
    private String joinMessage;
//    private Boolean delYn;
//    private String createDate;
}
