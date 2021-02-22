package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Echarts4Controller {
    @GetMapping("/echarts4")
    public String echarts4(){
        return "x-admin/echarts4";
    }
}
