package com.example.news.controller;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;

@Controller
public class AddNewsController {

    @Autowired
    NewsMapper newsMapper;


    @GetMapping("/publish")
    public String publishFrom(Model model){
        News news = new News();
        news.setNewsTitle("");
        news.setNewsContent("");
        news.setNewsSum("");
        model.addAttribute("news",new News());
        return "homepage/addNews";
    }

    @GetMapping("/newsUpdate")
    public String setContent(@RequestParam(value = "title")String title,Model model){
        News temp = new News();
        temp.setNewsTitle(title);
        News news = newsMapper.findNewsByTitle(temp);
        model.addAttribute(news);
        return "homepage/addNews";
    }

    //新增/修改
    @PostMapping("/publish")
    public String publishSubmit(@ModelAttribute News news){

//        如果标题已存在，则更新新闻，否则插入新闻
        news.setPublicTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").
                format(System.currentTimeMillis()));
        news.setNewsCreatorId(null);
        news.setPublicStateId(1);
        news.setColumnId(1);
        news.setNewsFormatId(1);

        if (newsMapper.findNewsByTitle(news)==null){
            newsMapper.insertNews(news);
        }
        else {
            newsMapper.updateNews(news);
        }
        return "homepage/addNews";
    }


}
