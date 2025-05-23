package com.example.EmployeePayrollApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService service;

    @GetMapping
    public List<EmployeePayrollData> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeePayrollData getById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping
    public EmployeePayrollData create(@RequestBody EmployeePayrollDTO dto) {
        return service.createEmployee(dto);
    }

    @PutMapping("/{id}")
    public EmployeePayrollData update(@PathVariable int id, @RequestBody EmployeePayrollDTO dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted";
    }

}

