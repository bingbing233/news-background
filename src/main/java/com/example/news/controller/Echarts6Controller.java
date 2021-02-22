package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Echarts6Controller {
    @GetMapping("/echarts6")
    public String echarts6(){
        return "x-admin/echarts6";
    }
}
