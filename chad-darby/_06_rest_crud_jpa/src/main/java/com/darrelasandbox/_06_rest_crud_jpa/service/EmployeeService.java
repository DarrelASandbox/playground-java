package com.darrelasandbox._06_rest_crud_jpa.service;

import java.util.List;

import com.darrelasandbox._06_rest_crud_jpa.entity.Employee;

public interface EmployeeService {
  List<Employee> findAll();

  Employee findById(int theId);

  Employee save(Employee theEmployee);

  void deleteById(int theId);
}
