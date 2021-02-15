package com.example.news.mapper;

import com.example.news.dao.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {

   // @Insert("insert into admin (admin_name,admin_contact,admin_password)values(#{adminName},#{adminContact},#{adminPassword})")
    void addAdmin(Admin admin);

   // @Select("select admin_name as adminName ,admin_password as adminPassword  from admin where admin_name = #{name}")
    Admin findAdmin(@Param("name") String name);

}
