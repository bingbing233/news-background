package com.example.news.controller;

import com.example.news.dao.Admin;
import com.example.news.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminListController {
    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/adminList")
    public String adminList(Model model){
        List<Admin> adminList = adminMapper.findAllAdmin();
        model.addAttribute("adminList",adminList);
        return "x-admin/admin-list";
    }

    @GetMapping("/adminDelete")
    public String adminDelete(@RequestParam (value = "adminName") String adminName,Model model){
        adminMapper.deleteAdmin(adminName);
        List<Admin> adminList = adminMapper.findAllAdmin();
        model.addAttribute("adminList",adminList);
        return "x-admin/admin-list";
    }
}
