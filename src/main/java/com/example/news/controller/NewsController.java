package com.example.news.controller;

import com.example.news.dao.News;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    NewsMapper newsMapper;

    @GetMapping("/news")
    public String news(Model model){
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "homepage/news";

    }

    @GetMapping("/newsDelete")
    public String newsDelete(@RequestParam(value = "newsTitle")String title,Model model){
        if(title!=null){
            News temp = new News();
            temp.setNewsTitle(title);
            newsMapper.deleteNews(temp.getNewsTitle());
        }
        List<News> newsList = newsMapper.findAllNews();
        model.addAttribute("newsList",newsList);
        return "homepage/news";
    }


/*    @PostMapping("/newsUpload")
    public String  newsUpload(){
        List<News> news = newsMapper.findAllNews();
        for (News temp:news){
            temp.save(new SaveListener() {
                @Override
                public void onSuccess(String s, String s1) {
                    System.out.println("上传数据成功！");
                }

                @Override
                public void onFailure(BmobException e) {
                    System.out.println("上传数据失败！");
                    System.out.println(e.toString());
                }
            });
        }
        return "homepage/news";
    }*/

}
