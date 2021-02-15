package com.example.news.controller;


import com.example.news.dao.Admin;
import com.example.news.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("admin",new Admin());
    return "login/login";
    }

    @PostMapping("/login")
    public String loginPost(@ModelAttribute Admin admin,Model model){

        Admin gotAdmin = adminMapper.findAdmin(admin.getAdminName());

        if(admin.getAdminPassword().equals(gotAdmin.getAdminPassword())){
            return "homepage/index";
        }
        model.addAttribute("error","用户名或密码错误");
    return "login/login";
    }
}
