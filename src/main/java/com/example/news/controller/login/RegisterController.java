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
public class RegisterController {

    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("admin",new Admin());
        return "login/register";
    }

    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute Admin admin){
        //查询需要注册的用户名，如果用户名已存在，注册失败
        if(adminMapper.findAdminByName(admin.getAdminName())==null){
            adminMapper.addAdmin(admin);
            return "login/login";
        }
        System.out.println(adminMapper.findAdminByName(admin.getAdminName()).getAdminName());
        return "login/register";
    }


}

