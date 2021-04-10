package com.example.news.controller.employee;

import com.example.news.dao.Employee;
import com.example.news.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeListController {

    @Autowired
    EmployeeMapper employeeMapper;

    //查询全部
    @GetMapping("/employeeList")
    public String employeeList(Model model){
        List<Employee> employeeList = employeeMapper.findAllEmployee();
        model.addAttribute(employeeList);
        model.addAttribute("emp",new Employee());
        return "x-admin/employee-list";
    }

    //模糊查询
    @GetMapping("/searchEmployee")
    public String searchEmployee(@ModelAttribute Employee employee, Model model){
        List<Employee> employeeList = employeeMapper.findEmployeeByName(employee.getEmpName());
        model.addAttribute(employeeList);
        model.addAttribute("emp",new Employee());
        return "x-admin/employee-list";
    }

    //删除
    @GetMapping("/employeeDelete")
    public String employeeDelete(@RequestParam(value = "id")int id, Model model){
        employeeMapper.deleteEmployee(id);
        List<Employee> employeeList = employeeMapper.findAllEmployee();
        model.addAttribute(employeeList);
        return "x-admin/employee-list";
    }


}
