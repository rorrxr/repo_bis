package com.etergg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    JoinService service;

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

//    @GetMapping("/projects")
//    public String projects(){
//        return "projects";
//    }

    @PostMapping(value = "/contact")
    public String joinInsert(JoinDto dto) throws Exception{
        service.join(dto); // 서비스의 insert 호출

        return "redirect:/"; // 이전 페이지로
    }


}
