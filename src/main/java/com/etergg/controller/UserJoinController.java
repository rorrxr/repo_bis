package com.etergg.controller;

import com.etergg.dto.UserJoinRequestDto;
import com.etergg.dto.UserJoinResponseDto;
import com.etergg.service.UserJoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserJoinController {

    @Autowired
    private UserJoinService userJoinservice;

    @PostMapping("/join")
    public UserJoinResponseDto createPost(@RequestBody UserJoinRequestDto requestDto) {

        System.out.println("userNickname: " + requestDto.getUserNickname());
        System.out.println("userRank: " + requestDto.getUserRank());
        System.out.println("userMost1: " + requestDto.getUserMost1());
        System.out.println("userMost2: " + requestDto.getUserMost2());
        System.out.println("userMost3: " + requestDto.getUserMost3());
        System.out.println("joinCategory: " + requestDto.getJoinCategory());
        System.out.println("joinMessage: " + requestDto.getJoinMessage());
        System.out.println("delYn: " + requestDto.getDelYn());
        System.out.println("createDate: " + requestDto.getCreateDate());

        return userJoinservice.save(requestDto);
    }

}

