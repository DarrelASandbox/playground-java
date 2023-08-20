package com.darrelasandbox._08_rest_security_employee.service;

import java.util.List;

import com.darrelasandbox._08_rest_security_employee.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
