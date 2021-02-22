package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Echarts5Controller {
    @GetMapping("/echarts5")
    public String echarts5(){
        return "x-admin/echarts5";
    }
}
