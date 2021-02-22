package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Echarts2Controller {
    @GetMapping("/echarts2")
    public String echarts2(){
        return "x-admin/echarts2";
    }
}
