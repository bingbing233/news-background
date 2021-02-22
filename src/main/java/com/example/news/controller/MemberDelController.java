package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberDelController {
    @GetMapping("/member-del")
    public String memberDel(){
        return "x-admin/member-del";
    }
}
