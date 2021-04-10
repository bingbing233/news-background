package com.example.news.mapper;

import com.example.news.dao.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {

    void addAdmin(Admin admin);

    Admin findAdminByName(String name);

    Admin findAdminById(int id);

    List<Admin> findAdminFuzzyByName(String name);

    void deleteAdmin(String name);

    List<Admin> findAllAdmin();

    void updateAdmin(Admin admin);

}
