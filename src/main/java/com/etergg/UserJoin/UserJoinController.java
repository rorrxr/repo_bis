package com.etergg.UserJoin;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserJoinController {
    // @RequiredArgsConstructor를 사용하는 경우
    private final UserJoinService userJoinservice;

    @PostMapping("/contact")
    public String insertUserJoin(@ModelAttribute UserJoinDto userJoinDto) throws Exception {
        //Long id = userJoinService.insert(userJoinDto); // 필요한 경우 id return
        return "redirect:/";
    }

    // @RequiredArgsConstructor를 사용하지 않는 경우
//    @Autowired
//    private UserJoinService userJoinservice;


    // 기존코드
//    @PostMapping("/contact")
//    public String joinInsert(@ModelAttribute JoinDto dto) throws Exception{ // dto
//        joinService.insert(dto);
//        return "redirect:/"; // 리턴할 html 리스트 페이지로
//    }
}

