package com.etergg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

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


}
