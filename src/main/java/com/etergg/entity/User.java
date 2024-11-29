package com.etergg.entity;

import com.etergg.dto.UserJoinRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "userjoin")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userNickname;

    @Column(nullable = false)
    private String userRank;

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
    private String delYn;

    @CreationTimestamp // Hibernate에서 생성 타임스탬프 자동 설정
    @Column(nullable = false, updatable = false)
    private LocalDateTime createDate;

//    @PrePersist
//    private void prePersist() {
//        this.delYn = this.delYn == null ? "N" : this.delYn;
//    }

    public User(UserJoinRequestDto requestDto) {
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

    public void update(UserJoinRequestDto requestDto) {
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

    public void delete(UserJoinRequestDto requestDto) {
        this.userNickname = requestDto.getUserNickname();
        this.userRank = requestDto.getUserRank();
        this.userMost1 = requestDto.getUserMost1();
        this.userMost2 = requestDto.getUserMost2();
        this.userMost3 = requestDto.getUserMost3();
        this.joinCategory = requestDto.getJoinCategory();  // joinCategory 값이 null이 아니어야 함
        this.joinMessage = requestDto.getJoinMessage();
        this.delYn = "Y"; // 기본값
        this.createDate = LocalDateTime.now();
    }

}
