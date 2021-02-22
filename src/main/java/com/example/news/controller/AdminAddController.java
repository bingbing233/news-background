package com.example.news.controller;

import com.example.news.dao.Admin;
import com.example.news.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminAddController {
    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/adminAdd")
    public String adminAdd(){
        return "x-admin/admin-add";
    }

    @PostMapping("/addAdmin")
    public String addAdmin(@ModelAttribute Admin admin){
        //查询需要注册的用户名，如果用户名已存在，注册失败
        if(adminMapper.findAdmin(admin.getAdminName())==null){
            adminMapper.addAdmin(admin);
            return "login/login";
        }
        System.out.println(adminMapper.findAdmin(admin.getAdminName()).getAdminName());
        return "x-admin/admin-add";
    }
}
