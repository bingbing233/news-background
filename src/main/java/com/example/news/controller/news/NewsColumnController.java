package com.example.news.controller.news;

import com.example.news.dao.Column;
import com.example.news.mapper.NewsColumnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NewsColumnController {

    @Autowired
    NewsColumnMapper newsColumnMapper;

    //查找
    @GetMapping("/newsColumn")
    public String newsColumn(Model model){
        List<Column> columnList = newsColumnMapper.findAllColumn();
        model.addAttribute("columnList",columnList);
        model.addAttribute("column",new Column());
        System.out.println(columnList.toString());
        return "x-admin/news-column";
    }

    @GetMapping("/deleteColumn")
    public String deleteColumn(@RequestParam(value = "name") String name,Model model){
        newsColumnMapper.deleteColumn(name);
        List<Column> columnList = newsColumnMapper.findAllColumn();
        model.addAttribute("columnList",columnList);
        return "x-admin/news-column";
    }

    @GetMapping("/addColumn")
    public String addColumn(@ModelAttribute Column column,Model model){
        newsColumnMapper.addColumn(column);
        List<Column> columnList = newsColumnMapper.findAllColumn();
        model.addAttribute("columnList",columnList);
        return "x-admin/news-column";
    }

}
