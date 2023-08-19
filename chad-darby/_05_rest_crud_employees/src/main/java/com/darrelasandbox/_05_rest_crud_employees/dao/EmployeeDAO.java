package com.darrelasandbox._05_rest_crud_employees.dao;

import java.util.List;

import com.darrelasandbox._05_rest_crud_employees.entity.Employee;

public interface EmployeeDAO {
  List<Employee> findAll();

  Employee findById(int theId);

  Employee save(Employee theEmployee);

  void deleteById(int theId);
}
