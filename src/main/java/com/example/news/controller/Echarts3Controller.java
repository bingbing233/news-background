package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Echarts3Controller {
    @GetMapping("/echarts3")
    public String echarts3(){
        return "x-admin/echarts3";
    }
}
