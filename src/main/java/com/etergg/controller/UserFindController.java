package com.etergg.controller;

import com.etergg.dto.UserJoinRequestDto;
import com.etergg.dto.UserJoinResponseDto;
import com.etergg.entity.User;
import com.etergg.service.UserFindService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

//    @GetMapping("/find/{id}")
//    public ResponseEntity<User> getPostById(@PathVariable Long id) {
//        User post = userFindService.getPostById(id);
//        if (post == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(post);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<User> updatePost(@PathVariable Long id, @RequestBody UserJoinRequestDto requestDto) {
//        User post = userFindService.update(id, requestDto);
//        if (post == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(post);
//    }

    // 게시글 수정
    @PostMapping("/update/{id}")
    public UserJoinResponseDto updatePost(@PathVariable Long id, @RequestBody UserJoinRequestDto requestDto) {
        System.out.println("Updating post with ID: " + id);
        UserJoinResponseDto updatedPost = userFindService.update(id, requestDto); // 수정된 게시글
        return updatedPost;
    }

    //    @PutMapping("/{id}")
//    public ResponseEntity<User> updatePost(@PathVariable Long id, @RequestBody UserJoinRequestDto requestDto) {
//        User post = userFindService.update(id, requestDto);
//        if (post == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(post);
//    }

    @GetMapping("/finds/{id}")
    public ResponseEntity<User> getPost(@PathVariable Long id) {
        User post = userFindService.findById(id);
        if (post != null) {
            return ResponseEntity.ok(post);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }


     // 게시글 삭제
    @DeleteMapping("/find/{id}")
    public String deletePost(@PathVariable Long id) {
        System.out.println("Deleting post with ID: " + id);  // 로그로 확인

        return userFindService.delete(id);
    }
}
