package com.example.news.controller.admin;

import com.example.news.dao.Admin;
import com.example.news.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminUpdateController {

    @Autowired
    AdminMapper adminMapper;

    @PostMapping("/updateAdmin")
    public String updateAdmin(@ModelAttribute Admin admin, Model model){
        adminMapper.updateAdmin(admin);
        System.out.println(admin.toString());
        List<Admin> allAdmin = adminMapper.findAllAdmin();
        model.addAttribute(allAdmin);
        return "x-admin/admin-list";
    }
}
