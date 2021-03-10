package com.example.news.controller;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;

@Controller
public class OrderAddController {
    @Autowired
    NewsMapper newsMapper;

    @GetMapping("/orderAdd")
    public String orderAdd(Model model){
        model.addAttribute("news",new News());
        return "x-admin/order-add";
    }

    @PostMapping("/addNews")
    public String addNews(@ModelAttribute News news){
        news.setPublicTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
        news.setNewsCreator("张三");
        news.setPublicState("未通过");
        news.setColumn("推荐");
        newsMapper.insertNews(news);
        System.out.println(news.toString());
        return "x-admin/order-add";
    }
}
