package com.example.news.controller.admin;

import com.example.news.dao.Admin;
import com.example.news.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminListController {
    @Autowired
    AdminMapper adminMapper;

    //查询全部admin
    @GetMapping("/adminList")
    public String adminList(Model model){
        List<Admin> adminList = adminMapper.findAllAdmin();
        model.addAttribute("adminList",adminList);
        model.addAttribute("admin",new Admin());
        return "x-admin/admin-list";
    }

    //模糊查询admin
    @GetMapping("/searchAdmin")
    public String searchAdmin(@ModelAttribute Admin admin,Model model){
        List<Admin> adminList = adminMapper.findAdminFuzzyByName(admin.getAdminName());
        model.addAttribute("adminList",adminList);
        return "x-admin/admin-list";
    }

    //删除admin
    @GetMapping("/adminDelete")
    public String adminDelete(@RequestParam (value = "adminName") String adminName,Model model){
        adminMapper.deleteAdmin(adminName);
        List<Admin> adminList = adminMapper.findAllAdmin();
        model.addAttribute("adminList",adminList);
        return "x-admin/admin-list";
    }

    //更新admin
    @GetMapping("/adminUpdate")
    public String adminUpdate(@RequestParam(value = "adminId") int adminId, Model model ){
        Admin admin = adminMapper.findAdminById(adminId);
        System.out.println(admin.toString());
        model.addAttribute(admin);
        return "x-admin/admin-update";

    }
}
