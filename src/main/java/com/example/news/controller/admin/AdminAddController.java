package com.example.news.controller.admin;

import com.example.news.dao.Admin;
import com.example.news.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminAddController {
    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/adminAdd")
    public String adminAdd(Model model){
        model.addAttribute("admin",new Admin());
        return "x-admin/admin-add";
    }

    @PostMapping("/addAdmin")
    public String addAdmin(@ModelAttribute Admin admin) throws Exception {
        //查询需要注册的用户名，如果用户名已存在，注册失败
        if(adminMapper.findAdminByName(admin.getAdminName())==null){
            adminMapper.addAdmin(admin);
        }else{
            System.out.println("已存在相同管理员，添加失败");
            }
        return "x-admin/admin-add";
    }
}
