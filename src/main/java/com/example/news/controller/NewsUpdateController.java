package com.example.news.controller;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class NewsUpdateController {
    @Autowired
    NewsMapper newsMapper;

    @PostMapping("/newsUpdate")
    public String newsUpdate(@ModelAttribute News news, Model model){
        newsMapper.updateNews(news);
        System.out.println("id = "+news.getNewsId());
        List<News> allNews = newsMapper.findAllNews();
        model.addAttribute(allNews);
        return "x-admin/news-list";
    }
}
