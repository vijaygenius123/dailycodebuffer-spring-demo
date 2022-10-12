package com.vijaygenius123.dailycodebufferspringdemo.service;

import com.vijaygenius123.dailycodebufferspringdemo.model.Employee;

import java.util.List;


public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);
}
