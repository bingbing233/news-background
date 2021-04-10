package com.example.news.controller.news;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NewsListController {
    @Autowired
    NewsMapper newsMapper;

    //查询全部新闻
    @GetMapping("/newsList")
    public String newsList(Model model){
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        model.addAttribute("news",new News());
        return "x-admin/news-list";
    }

    //模糊查询新闻
    @GetMapping("/searchNews")
    public String searchNews(@ModelAttribute News news, Model model){
        List<News> newsList = newsMapper.findNewsFuzzyByTitle(news.getNewsTitle());
        model.addAttribute(newsList);
        return "x-admin/news-list";
    }

    //删除新闻
    @GetMapping("/deleteNews")
    public String deleteNews(@RequestParam(value = "id") int id, Model model){
        newsMapper.deleteNews(id);
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/news-list";
    }

    //通过审核
    @GetMapping("/approveNews")
    public String approveNews(@RequestParam(value = "id")int id ,Model model){
        newsMapper.approveNews(id);
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/news-list";

    }

    //未通过审核
    @GetMapping("/disapproveNews")
    public String disapproveNews(@RequestParam(value = "id") int id ,Model model){
        newsMapper.disapproveNews(id);
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "x-admin/news-list";
    }

    @GetMapping("/updateNews")
    public String updateNews(@RequestParam(value = "id")int id, Model model){
        News news =  newsMapper.findNewsById(id);
        model.addAttribute(news);
        return "x-admin/news-update";
    }

}
