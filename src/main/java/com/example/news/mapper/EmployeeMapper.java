package com.example.news.mapper;

import com.example.news.dao.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> findAllEmployee();
    List<Employee> findEmployeeByName(String name);
    void addEmployee(Employee employee);
    void deleteEmployee(int id);
    void updateEmployee(Employee employee);

}
