package com.example.mvcdemo.service;

import com.example.mvcdemo.dao.EmployeeRepository;
import com.example.mvcdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent())
            return employee.get();
        else
            throw new RuntimeException("Did not find employee with the id - " + id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> findAllByOrderLastNameAsc() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }


    @Override
    public void delete(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }


}
