package com.example.demo7.controller;

import com.example.demo7.pojo.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @RequestMapping("/")
    public List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
        return employeeList;
    }
}
