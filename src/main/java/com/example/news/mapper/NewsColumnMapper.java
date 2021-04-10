package com.example.news.mapper;

import com.example.news.dao.Column;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsColumnMapper {

    List<Column> findAllColumn();
    void addColumn(Column column);
    void deleteColumn(String name);
}
