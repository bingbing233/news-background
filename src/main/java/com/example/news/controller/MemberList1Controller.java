package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberList1Controller {
    @GetMapping("/memberList1")
    public String memberList1(){
        return "x-admin/member-list1";
    }
}
