package com.example.news.controller.echarts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Echarts1Controller {
    @GetMapping("/echarts1")
    public String echarts1(){
        return "x-admin/echarts1";
    }
}
