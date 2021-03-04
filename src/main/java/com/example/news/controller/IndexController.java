package com.example.news.controller;

import com.example.news.dao.Admin;
import com.example.news.dao.News;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("admin",new Admin());
        return "x-admin/index";
    }
}
