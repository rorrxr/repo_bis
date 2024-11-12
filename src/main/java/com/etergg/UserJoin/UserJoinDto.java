package com.etergg.UserJoin;

import lombok.*;

@Getter                     // Lombok, Getter
@Builder                  // Lombok, 상황에 따라 필요 매개변수만 사용하여 객체 생성
@ToString                  // Lombok, toString() 자동생성 어노테이션
@NoArgsConstructor            // Lombok, 매개변수 없는 생성자
@AllArgsConstructor            // Lombok, 모든 속성을 매개변수로 받는 생성자
public class UserJoinDto {
    private String userNickname;

    private Integer userRank;
    private String userMost1;
    private String userMost2;
    private String userMost3;

    private Integer joinCategory;      // 수정, Integer Reference Type
    private String joinMessage;

    public UserJoin toEntity() {
        return UserJoin.builder()
                .userNickname(userNickname)
                .userRank(userRank)
                .userMost1(userMost1)
                .userMost2(userMost2)
                .userMost3(userMost3)
                .joinMessage(joinMessage)
                .joinCategory(joinCategory)
                .build();
    }
}

