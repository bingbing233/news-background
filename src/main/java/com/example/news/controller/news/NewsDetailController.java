package com.example.news.controller.news;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsDetailController {

    @Autowired
    NewsMapper newsMapper;

    @GetMapping("/newsDetail")
    public String newsDetail(@RequestParam(value = "newsId") int id,
                             Model model){
        News result = newsMapper.findNewsById(id);
        model.addAttribute(result);
        return "newsDetail/newsDetail";
    }


}
