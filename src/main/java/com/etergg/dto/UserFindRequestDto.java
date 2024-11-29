package com.etergg.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserFindRequestDto {
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
}
