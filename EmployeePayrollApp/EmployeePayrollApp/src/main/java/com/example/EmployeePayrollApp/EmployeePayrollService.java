package com.example.EmployeePayrollApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeePayrollData> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeePayrollData getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeePayrollData createEmployee(EmployeePayrollDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(0, dto.name, dto.salary);
        return employeeRepository.save(emp);
    }

    public EmployeePayrollData updateEmployee(int id, EmployeePayrollDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(id, dto.name, dto.salary);
        return employeeRepository.save(emp);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}

