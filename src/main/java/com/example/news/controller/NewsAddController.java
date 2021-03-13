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
public class NewsAddController {
    @Autowired
    NewsMapper newsMapper;

    @GetMapping("/newsShow")
    public String orderAdd(Model model){
        model.addAttribute("news",new News());
        return "x-admin/news-add";
    }

    @PostMapping("/newsAdd")
    public String addNews(@ModelAttribute News news){
        news.setNewsPublicTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
        news.setNewsCreator("张三");
        news.setNewsPublicState("未通过");
        newsMapper.insertNews(news);
        System.out.println(news.toString());
        return "x-admin/news-add";
    }
}
