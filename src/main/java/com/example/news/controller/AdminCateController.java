package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminCateController {
    @GetMapping("/adminCate")
    public String adminCate(){
        return "x-admin/admin-cate";
    }
}
