package com.etergg.UserJoin;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@NoArgsConstructor  // Lombok, 매개변수 없는 생성자
@AllArgsConstructor // Lombok, 모든 속성을 매개변수로 받는 생성자
public class UserJoin {
    private Long id;
    private String userNickname;

    private Integer userRank;
    private String userMost1;
    private String userMost2;
    private String userMost3;

    private Integer joinCategory;
    private String joinMessage;
    private Boolean delYn;
    private LocalDateTime createDate;
}
