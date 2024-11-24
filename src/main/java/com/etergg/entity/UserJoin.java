package com.etergg.entity;

import com.etergg.dto.UserJoinRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_join")
public class UserJoin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userNickname;

    @Column(nullable = false)
    private Integer userRank;

    @Column(nullable = false)
    private String userMost1;

    private String userMost2;

    private String userMost3;

    @Column(nullable = false)
    private Integer joinCategory;

    @Column(nullable = false)
    private String joinMessage;

//    @Column(nullable = false)
//    private Boolean delYn;

//    private LocalDateTime createDate;
//    private String createDate;

    public UserJoin(UserJoinRequestDto requestDto) {
        this.id = id;
        this.userNickname = userNickname;
        this.userRank = userRank;
        this.userMost1 = userMost1;
        this.userMost2 = userMost2;
        this.userMost3 = userMost3;
        this.joinCategory = joinCategory;
        this.joinMessage = joinMessage;
//        this.delYn = delYn;
//        this.createDate = createDate;
    }
}
