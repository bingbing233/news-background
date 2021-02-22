package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberListController {
    @GetMapping("/memberList")
    public String memberList(){
        return "x-admin/member-list";
    }
}
