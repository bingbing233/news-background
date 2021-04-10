package com.example.news.controller.admin;

import com.example.news.dao.Permission;
import com.example.news.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminPermissionController {

    @Autowired
    PermissionMapper permissionMapper;

    //打开权限列表界面
    @GetMapping("/adminPermission")
    public String adminRole(Model model){
        List<Permission> allPermission = permissionMapper.findAllPermission();
        model.addAttribute("permissionList",allPermission);
        return "x-admin/admin-permission";
    }

    //打开添加权限的界面
    @GetMapping("/permissionAdd")
    public String permissionAdd(Model model){
        model.addAttribute("permission",new Permission());
        return "x-admin/admin-permission-add";
    }

    //添加权限
    @PostMapping("/addPermission")
    public String addPermission(@ModelAttribute Permission permission) {
        if(permissionMapper.findPermissionByName(permission.getPermissionName())==null){
            permissionMapper.addPermission(permission);
        }else{
            System.out.println("已存在相同权限，无法进行添加");
        }
        return "x-admin/admin-permission-add";
    }

    //删除权限
    @GetMapping("/deletePermission")
    public String deletePermission(@RequestParam (value = "id") int id,Model model){
        permissionMapper.deletePermission(id);
        List<Permission> allPermission = permissionMapper.findAllPermission();
        model.addAttribute("permissionList",allPermission);
        return "x-admin/admin-permission";
    }
}
