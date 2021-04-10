package com.example.news.controller.echarts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Echarts8Controller {
    @GetMapping("/echarts8")
    public String echarts8(){
        return "x-admin/echarts8";
    }
}
