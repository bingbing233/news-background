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

    //展示新闻
    @GetMapping("/orderList")
    public String orderList(Model model){
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/order-list";
    }

    //删除新闻
    @GetMapping("/deleteNews")
    public String deleteNews(@RequestParam(value = "id") int id, Model model){
        newsMapper.deleteNews(id);
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/order-list";
    }

    //通过审核
    @GetMapping("/approveNews")
    public String approveNews(@RequestParam(value = "id")int id ,Model model){
        newsMapper.approveNews(id);
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/order-list";

    }

    //未通过审核
    @GetMapping("/disapproveNews")
    public String disapproveNews(@RequestParam(value = "id") int id ,Model model){
        newsMapper.disapproveNews(id);
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/order-list";
    }

}
