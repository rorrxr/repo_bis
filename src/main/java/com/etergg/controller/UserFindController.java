package com.etergg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserFindController {
    @GetMapping("/resume")
    public String index(){
        return "resume";
    }
}
