package com.example.news.mapper;


import com.example.news.dao.News;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NewsMapper {

    List<News> findAllNews();

    News findNewsById(int id);

    //模糊查询
    List<News> findNewsFuzzyByTitle(String title);

    void insertNews(News news);

    void deleteNews(int id);

    void updateNews(News news);

    void approveNews(int id);

    void disapproveNews(int id);


}

