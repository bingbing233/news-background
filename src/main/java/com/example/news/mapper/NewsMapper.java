package com.example.news.mapper;


import com.example.news.dao.News;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NewsMapper {

    List<News> findAllNews();

    News findNewsByTitle(News news);

    void insertNews(News news);

    void deleteNews(String title);

    void updateNews(News news);
}

