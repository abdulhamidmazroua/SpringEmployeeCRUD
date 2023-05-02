package com.example.mvcdemo.service;

import com.example.mvcdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public void save(Employee employee);

    public Employee findById(Integer id);

    public List<Employee> findAll();

    public List<Employee> findAllByOrderLastNameAsc();

    public void delete(Integer employeeId);
}
