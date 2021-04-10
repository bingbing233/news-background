package com.example.news.controller.employee;

import com.example.news.dao.Employee;
import com.example.news.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeAddController {

    @Autowired
    EmployeeMapper employeeMapper;

    //跳转
    @GetMapping("/employeeAdd")
    public String employeeAdd(Model model){
        model.addAttribute("employee",new Employee());
        return "x-admin/employee-add";
    }


    //添加
    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee, Model model){
        employeeMapper.addEmployee(employee);
        return "x-admin/employee-add";
    }
}
