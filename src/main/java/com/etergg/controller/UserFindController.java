package com.etergg.controller;

import com.etergg.dto.UserJoinRequestDto;
import com.etergg.dto.UserJoinResponseDto;
import com.etergg.service.UserFindService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserFindController {

    private final UserFindService userFindService;

    @GetMapping("/finds")
    @ResponseBody
    public List<UserJoinResponseDto> getAllPosts() {
        return userFindService.getAllPosts();
    }

    // 게시글 수정
    @PutMapping("/find/{id}")
    public UserJoinResponseDto updatePost(@PathVariable Long id, @RequestBody UserJoinRequestDto requestDto) {
        System.out.println("Updating post with ID: " + id);

        return userFindService.update(id, requestDto);
    }

     // 게시글 삭제
    @DeleteMapping("/find/{id}")
    public String deletePost(@PathVariable Long id) {
        System.out.println("Deleting post with ID: " + id);  // 로그로 확인

        return userFindService.delete(id);
    }
}
