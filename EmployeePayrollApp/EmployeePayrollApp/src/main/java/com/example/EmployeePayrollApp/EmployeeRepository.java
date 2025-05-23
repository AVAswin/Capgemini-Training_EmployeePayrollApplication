package com.example.EmployeePayrollApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeePayrollData, Integer> {
}

