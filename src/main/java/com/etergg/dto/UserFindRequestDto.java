package com.etergg.dto;

import java.time.LocalDateTime;

public class UserFindRequestDto {
    private Long id;

    private String userNickname;

    private Integer userRank;

    private String userMost1;
    private String userMost2;
    private String userMost3;

    private String joinCategory;

    private String joinMessage;

    private String delYn;
    private LocalDateTime createDate;
}
