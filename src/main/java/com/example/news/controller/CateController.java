package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CateController {
    @GetMapping("/cate")
    public String cate(){
        return "x-admin/cate";
    }
}
