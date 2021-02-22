package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome1Controller {
    @GetMapping("/welcome1")
    public String welcome1(){
        return "x-admin/welcome1";
    }
}
