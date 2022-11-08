package com.vijaygenius123.dailycodebufferspringdemo.repository;

import com.vijaygenius123.dailycodebufferspringdemo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {
}
