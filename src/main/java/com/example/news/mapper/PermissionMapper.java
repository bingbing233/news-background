package com.example.news.mapper;

import com.example.news.dao.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<Permission> findAllPermission();

    Permission findPermissionByName(String name);

    void addPermission(Permission permission);

    void deletePermission(int id);
}
