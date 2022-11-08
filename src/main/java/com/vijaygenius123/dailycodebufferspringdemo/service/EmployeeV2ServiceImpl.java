package com.vijaygenius123.dailycodebufferspringdemo.service;

import com.vijaygenius123.dailycodebufferspringdemo.model.Employee;
import com.vijaygenius123.dailycodebufferspringdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }

    @Override
    public String deleteEmployeeById(String id) {
        return null;
    }
}
