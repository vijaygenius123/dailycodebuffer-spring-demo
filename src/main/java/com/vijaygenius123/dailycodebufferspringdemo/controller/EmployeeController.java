package com.vijaygenius123.dailycodebufferspringdemo.controller;

import com.vijaygenius123.dailycodebufferspringdemo.model.Employee;
import com.vijaygenius123.dailycodebufferspringdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee  save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getAllEmployees(@PathVariable String id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable String id){
        return employeeService.deleteEmployeeById(id);
    }


}
