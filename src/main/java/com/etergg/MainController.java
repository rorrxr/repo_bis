package com.etergg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class MainController {

    @Autowired
    JoinService joinService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    // 구인 등록
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    // 구인 찾기
    @GetMapping("/resume")
    public String resume(){
        return "resume";
    }

    // 구인 등록 처리
    @PostMapping("/contact")
    public ResponseEntity<Map<String, Object>> handleJoinForm(
            @RequestParam ("userNickname") String userNickname,
            @RequestParam("userRank") int userRank,
            @RequestParam("userMost1") String userMost1,
            @RequestParam("userMost2") String userMost2,
            @RequestParam("userMost3") String userMost3,
            @RequestParam("joinCategory") int joinCategory,
            @RequestParam("joinMessage") String joinMessage
    ) {
        Map<String, Object> response = new HashMap<>();
        try {
            // DTO 객체 생성
            JoinDto joinDto = new JoinDto();
            joinDto.setUserNickname(userNickname);
            joinDto.setUserRank(userRank);
            joinDto.setUserMost1(userMost1);
            joinDto.setUserMost2(userMost2);
            joinDto.setUserMost3(userMost3);
            joinDto.setJoinCategory(joinCategory);
            joinDto.setJoinMessage(joinMessage);

            // DB에 저장하는 로직
            joinService.join(joinDto);  // DB에 구인 정보 저장
            response.put("success", true);
        } catch (Exception e) {
            response.put("success", false);
            response.put("error", e.getMessage());
        }
        return ResponseEntity.ok(response);  // JSON 응답 반환
    }
}
