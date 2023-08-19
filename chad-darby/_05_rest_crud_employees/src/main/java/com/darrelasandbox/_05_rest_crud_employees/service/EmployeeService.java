package com.darrelasandbox._05_rest_crud_employees.service;

import java.util.List;

import com.darrelasandbox._05_rest_crud_employees.entity.Employee;

public interface EmployeeService {
  List<Employee> findAll();
}
