package com.example.mvcdemo.dao;

import com.example.mvcdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Add a method to sort by last name
    // an interesting idea here is that Spring Data JPA will parse the method name searching for a predefined pattern
    // if the method name follows the specific pattern, it will generate an appropriate query .. behind the scene!!!
    public List<Employee> findAllByOrderByLastNameAsc();
    // here the findAllBy part is parsed to (from Employee) and OrderByLastNameAsc is parsed to (order by lastNameAsc)
    // final JPQL query: from Employee order by lastName asc;
}
