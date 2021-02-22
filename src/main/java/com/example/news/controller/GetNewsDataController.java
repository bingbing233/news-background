package com.example.news.controller;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetNewsDataController {

    @Autowired
    NewsMapper newsMapper;

    @GetMapping("/getData")
    public String getNews(){
        List<News> newsList = newsMapper.findAllNews();
        StringBuilder data = new StringBuilder();
        for(News news:newsList){
            data.append(news.toString());
        }
        return data.toString();
    }
}
