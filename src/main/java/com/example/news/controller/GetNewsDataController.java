package com.example.news.controller;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class  GetNewsDataController {

    @Autowired
    NewsMapper newsMapper;

    @RequestMapping(value = "/getData")
    @ResponseBody
    public List<News> getNews(){
        List<News> newsList = newsMapper.findAllNews();
        return newsList;
    }
}
