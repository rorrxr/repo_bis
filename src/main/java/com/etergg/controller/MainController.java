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
    public String join(){
        return "join";
    }

    // 구인 찾기
    @GetMapping("/find")
    public String find(){
        return "find";
    }

    @GetMapping("/update")
    public String update(){
        return "update";
    }

}
