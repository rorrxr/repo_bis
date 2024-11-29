package com.etergg.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserJoinRequestDto {
    private Long id;

    @NotBlank
    private String userNickname;

    @NotNull
    private String userRank;

    @NotBlank
    private String userMost1;
    private String userMost2;
    private String userMost3;

    @NotBlank
    private String joinCategory;

    @NotBlank
    private String joinMessage;

    @NotBlank
    private String delYn;
    private LocalDateTime createDate;
}
