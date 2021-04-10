package com.example.news.controller.login;


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
    return "x-admin/login";
    }

    @PostMapping("/login")
    public String loginPost(@ModelAttribute Admin admin,Model model){
        //判断密码是否正确，正确跳转到index，否则跳回login
        if(adminMapper.findAdminByName(admin.getAdminName()).getAdminPassword().equals(admin.getAdminPassword())){
            model.addAttribute("admin",admin);
            return "x-admin/index";
        }

        model.addAttribute("error","用户名或密码错误");
    return "x-admin/login";
    }
}
