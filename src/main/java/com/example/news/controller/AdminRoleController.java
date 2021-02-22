package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminRoleController {

    @GetMapping("/adminRole")
    public String adminRole(){
        return "x-admin/admin-role";
    }
}
