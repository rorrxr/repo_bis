package com.etergg.entity;

import com.etergg.dto.UserJoinRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userjoin")
public class UserJoin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userNickname;

    @Column(nullable = false)
    private Integer userRank;

    @Column(nullable = false)
    private String userMost1;

    @Column
    private String userMost2;

    @Column
    private String userMost3;

    @Column(nullable = false)
    private String joinCategory;

    @Column(nullable = false)
    private String joinMessage;

    @Column(nullable = false)
    private String delYn = "N";

//    @Column(name = "created_date")
    @CreatedDate
    private LocalDateTime createDate;
//    private String createDate;

    public UserJoin(UserJoinRequestDto requestDto) {
        this.userNickname = requestDto.getUserNickname();
        this.userRank = requestDto.getUserRank();
        this.userMost1 = requestDto.getUserMost1();
        this.userMost2 = requestDto.getUserMost2();
        this.userMost3 = requestDto.getUserMost3();
        this.joinCategory = requestDto.getJoinCategory();  // joinCategory 값이 null이 아니어야 함
        this.joinMessage = requestDto.getJoinMessage();
        this.delYn = "N"; // 기본값
        this.createDate = LocalDateTime.now();
    }

}
