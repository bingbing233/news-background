package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminRuleController {
    @GetMapping("/adminRule")
    public String adminRule(){
        return "x-admin/admin-rule";
    }
}
