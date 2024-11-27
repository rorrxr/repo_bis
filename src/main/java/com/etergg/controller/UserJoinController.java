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

//    @GetMapping("/resume")
//    @ResponseBody
//    public List<UserJoinResponseDto> getAllPosts() {
//        return userJoinservice.getAllPosts();
//    }

    // 게시글 작성
//    @PostMapping("/contact")
//    public UserJoinResponseDto createPost(@ModelAttribute UserJoinRequestDto requestDto) {
//        return userJoinservice.save(requestDto);
//    }

    @PostMapping("/contact")
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

    // 게시글 수정
//    @PutMapping("/post/{id}")
//    public MarketResponseDto updatePost(@PathVariable Long id, @RequestBody MarketRequestDto requestDto) {
//        System.out.println("Updating post with ID: " + id);
//
//        return userJoinservice.update(id, requestDto);
//    }

    // 게시글 삭제
//    @DeleteMapping("/post/{id}")
//    public String deletePost(@PathVariable Long id) {
//        System.out.println("Deleting post with ID: " + id);  // 로그로 확인
//
//        return userJoinservice.delete(id);
//    }

}

