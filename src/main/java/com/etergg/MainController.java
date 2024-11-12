package com.etergg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/contact")
    public String joinInsert(JoinDto dto) throws Exception{ // dto
        joinService.insert(dto);

        return "redirect:/contact"; // 리턴할 html 리스트 페이지로
    }

}
