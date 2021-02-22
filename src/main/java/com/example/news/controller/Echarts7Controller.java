package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Echarts7Controller {
    @GetMapping("/echarts7")
    public String echarts7(){
        return "x-admin/echarts7";
    }
}
