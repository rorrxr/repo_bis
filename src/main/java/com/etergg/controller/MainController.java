package com.etergg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    // 구인 등록
    @GetMapping("/join")
    public String contact(){
        return "join";
    }

    // 구인 찾기
//    @GetMapping("/resume")
//    public String resume(){
//        return "resume";
//    }
}
