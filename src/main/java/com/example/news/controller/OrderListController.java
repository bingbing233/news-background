package com.example.news.controller;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderListController {
    @Autowired
    NewsMapper newsMapper;

    @GetMapping("/orderList")
    public String orderList(Model model){
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/order-list";
    }

    @GetMapping("/deleteNews")
    public String deleteNews(@RequestParam(value = "title") String title, Model model){
        newsMapper.deleteNews(title);
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/order-list";
    }

}
