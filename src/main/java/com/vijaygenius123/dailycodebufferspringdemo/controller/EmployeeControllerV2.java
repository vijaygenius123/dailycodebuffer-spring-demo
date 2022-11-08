package com.vijaygenius123.dailycodebufferspringdemo.controller;

import com.vijaygenius123.dailycodebufferspringdemo.model.Employee;
import com.vijaygenius123.dailycodebufferspringdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees/v2")
public class EmployeeControllerV2 {

    @Qualifier("employeeV2ServiceImpl")
    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return employee;
    }
}
