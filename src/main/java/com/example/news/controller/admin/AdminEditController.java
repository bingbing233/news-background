package com.example.news.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminEditController {
    @GetMapping("/adminEdit")
    public String adminEdit(){
        return "x-admin/admin-edit";
    }
}
